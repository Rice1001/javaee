package org.example.spring.controller;

import org.example.spring.jdbc.Studentjdbc;
import org.example.spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/12 15:49
 */

@Controller
@RequestMapping("/student/")
public class StudentController {


    @Autowired
    Studentjdbc studentjdbc;

    @RequestMapping(value="add")
    public ModelAndView addStudent(@RequestParam("id") Long studentId,
                           @RequestParam("name") String studentName){
        Student s = new Student();
        s.setId(studentId);
        s.setName(studentName);
        ModelAndView mav = new ModelAndView("/success.jsp");
        if(studentjdbc.addStudent(s)){
            return mav;
        }
        else{
            mav.setViewName("/fail.jsp");
            return mav;
        }
    }

}
