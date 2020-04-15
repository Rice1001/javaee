package org.example.spring.controller;

import org.example.spring.jdbc.StudentHomeworkjdbc;
import org.example.spring.model.StudentHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    private StudentHomework studentHomework;

    @Autowired
    private StudentHomeworkjdbc studentHomeworkjdbc;
    @PostMapping("submit")
    public void addStudentHomework(@RequestParam("student_id") Long studentId,
                                   @RequestParam("homework_id") Long homeworkId,
                                   @RequestParam("homework_title") String homeworkTitle,
                                   @RequestParam("homework_content") String homeworkContent){

        studentHomework.setId(studentId);
        studentHomework.setHomeworkId(homeworkId);
        studentHomework.setHomeworkContent(homeworkContent);
        studentHomeworkjdbc.addStudentHomework(studentHomework);
    }

    @GetMapping("display")
    public ModelAndView displayAllStudentHomework(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentHomeworkList",studentHomeworkjdbc.selectAll());
        return modelAndView;
    }
}
