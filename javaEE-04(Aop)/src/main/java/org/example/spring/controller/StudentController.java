package org.example.spring.controller;

import org.example.spring.model.Student;
import org.example.spring.service.Impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rice
 * @version 1.0
 * @date 2020/5/3 16:28
 */
@Controller
@RequestMapping("/student/")
public class StudentController {

    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping(value="add")
    public ModelAndView addStudent(@RequestParam("studentId") Long studentId,
                                   @RequestParam("name") String studentName){
        Student s = new Student();
        s.setId(studentId);
        s.setName(studentName);
        ModelAndView mav = new ModelAndView("/success.jsp");
        if(studentService.insert(s)){
            return mav;
        }
        else{
            mav.setViewName("/fail.jsp");
            return mav;
        }
    }

}
