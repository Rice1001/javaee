package org.example.spring.controller;

import org.example.spring.jdbc.StudentHomeworkjdbc;
import org.example.spring.model.StudentHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/12 15:50
 */

@Controller
@RequestMapping("/studentHomework/")
public class StudentHomeworkController {

    @Autowired
    private StudentHomeworkjdbc studentHomeworkjdbc;
    @RequestMapping("submit")
    public ModelAndView addStudentHomework(@RequestParam("student_id") Long studentId,
                                   @RequestParam("homework_id") Long homeworkId,
                                   @RequestParam("homework_title") String homeworkTitle,
                                   @RequestParam("homework_content") String homeworkContent){

        StudentHomework studentHomework = new StudentHomework();
        studentHomework.setId(studentId);
        studentHomework.setHomeworkId(homeworkId);
        studentHomework.setHomeworkContent(homeworkContent);
        ModelAndView mav = new ModelAndView("/success.jsp");
        if(studentHomeworkjdbc.addStudentHomework(studentHomework))
            return mav;
        else{
            mav.setViewName("/fail.jsp");
            return mav;
        }

    }

    /**
     *
     *
     * @return  modelAndView
     */
    @RequestMapping("display")
    public ModelAndView displayAllStudentHomework(){
        ModelAndView modelAndView = new ModelAndView("/index.jsp");
        modelAndView.addObject("studentHomeworkList",studentHomeworkjdbc.selectAll());
        return modelAndView;
    }
}
