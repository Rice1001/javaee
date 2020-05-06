package org.example.spring.controller;

import org.example.spring.model.StudentHomework;
import org.example.spring.service.Impl.StudentHomeworkServiceImpl;
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
@RequestMapping("/studentHomework/")
public class StudentHomeworkController {

    @Autowired
    StudentHomeworkServiceImpl studentHomeworkService;

    @RequestMapping("submit")
    public ModelAndView addStudentHomework(@RequestParam("student_id") Long studentId,
                                           @RequestParam("homework_id") Long homeworkId,
                                           @RequestParam("homework_title") String homeworkTitle,
                                           @RequestParam("homework_content") String homeworkContent){

        StudentHomework studentHomework = new StudentHomework();
        studentHomework.setStudentId(studentId);
        studentHomework.setHomeworkId(homeworkId);
        studentHomework.setHomeworkTitle(homeworkTitle);
        studentHomework.setHomeworkContent(homeworkContent);
        ModelAndView mav = new ModelAndView("/success.jsp");
        if(studentHomeworkService.insert(studentHomework))
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
        ModelAndView modelAndView = new ModelAndView("/lookStudentHomeworkPage.jsp");
        modelAndView.addObject("studentHomeworkList",studentHomeworkService.selectAll());
        return modelAndView;
    }
}
