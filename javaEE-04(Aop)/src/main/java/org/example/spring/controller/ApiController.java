package org.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rice
 * @version 1.0
 * @date 2020/5/3 15:58
 */
@Controller
public class ApiController {

    /**
     *
     * display  the all homework page
     * @return the string of the student homework jsp
     */
    @RequestMapping("/lookHomework")
    public String jumpToCheck(){
        return "/lookHomeworkPage.jsp";
    }

    /**
     *
     * display the submit homework page
     * @return the string of the submit homework page
     */
    @RequestMapping("/submitHomework")
    public String jumpToSubmitHomework(){
        return "/submitHomeworkPage.jsp";
    }

    @RequestMapping("/addStudent")
    public String jumpToAddStudent(){
        return "/addStudentPage.jsp";
    }

    @RequestMapping("/addHomework")
    public String jumToAddHomework(){
        return "/addHomeworkPage.jsp";
    }

    @RequestMapping("/lookStudentHomework")
    public String lookStudentHomework(){
        return "/lookStudentHomeworkPage.jsp";
    }
}
