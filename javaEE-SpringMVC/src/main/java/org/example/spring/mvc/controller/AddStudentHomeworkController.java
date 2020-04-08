package org.example.spring.mvc.controller;

import org.example.spring.mvc.jdbc.StudentHomeworkjdbc;
import org.example.spring.mvc.model.StudentHomework;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/8 17:42
 */
@Controller
public class AddStudentHomeworkController {

    @RequestMapping(value = "/submitHomework", method = RequestMethod.POST)
    public String addStudentHomework(@RequestParam("student_id") Long student_id_in,
                                     @RequestParam("homework_id") Long homework_id_in,
                                     @RequestParam("homework_title") String homework_title_in,
                                     @RequestParam("homework_content") String homework_content_in){
        StudentHomework sh = new StudentHomework();
        sh.setHomeworkContent(homework_content_in);
        sh.setHomeworkId(homework_id_in);
        sh.setHomeworkTitle(homework_title_in);
        sh.setStudentId(student_id_in);
        if(StudentHomeworkjdbc.addStudentHomework(sh))
            return "/success.jsp";
        else
            return "/fail.jsp";
    }
}
