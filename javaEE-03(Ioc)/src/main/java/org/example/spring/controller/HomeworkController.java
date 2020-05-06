package org.example.spring.controller;

import org.example.spring.jdbc.Homeworkjdbc;
import org.example.spring.model.Homework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/12 15:50
 */

@Controller
@RequestMapping("/homework/")
public class HomeworkController {


    @Autowired
    Homeworkjdbc homeworkjdbc;

    @RequestMapping(value = "add")
    public ModelAndView addHomework(@RequestParam("id") Long hmId,
                            @RequestParam("title") String hmTitle,
                            @RequestParam("content") String hmContent){
        Homework hm = new Homework();
        hm.setId(hmId);
        hm.setContent(hmContent);
        hm.setTitle(hmTitle);
        ModelAndView mav = new ModelAndView("/success.jsp");
        if(homeworkjdbc.addHomework(hm)){
            return mav;

        }
        else{
            mav.setViewName("/fail.jsp");
            return mav;
        }

    }

    @RequestMapping("display")
    public ModelAndView displayAllStudentHomework(){
        ModelAndView modelAndView = new ModelAndView("/submitHomework.jsp");
        modelAndView.addObject("homeworkList",homeworkjdbc.selectAll());
        return modelAndView;
    }
}
