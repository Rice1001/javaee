package org.example.spring.controller;

import org.example.spring.jdbc.Studentjdbc;
import org.example.spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/17 13:44
 */
@Controller
@RequestMapping("/test/")
public class Test {

    @Autowired
    Studentjdbc studentjdbc;

    @RequestMapping("display")
    public ModelAndView displayAll(){
        ModelAndView mav = new ModelAndView("/test.jsp");
        List<Student> students = studentjdbc.selectAll();
        mav.addObject("studentList",students);

        return mav;
    }

}
