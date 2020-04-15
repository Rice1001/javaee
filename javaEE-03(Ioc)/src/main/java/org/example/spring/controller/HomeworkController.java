package org.example.spring.controller;

import org.example.spring.jdbc.Homeworkjdbc;
import org.example.spring.model.Homework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/homework/")
public class HomeworkController {

    @Autowired
    private Homework hm;

    @Autowired
    Homeworkjdbc homeworkjdbc;

    @PostMapping("add")
    public void addHomework(@RequestParam("id") Long hmId,
                            @RequestParam("title") String hmTitle,
                            @RequestParam("content") String hmContent){
        hm.setId(hmId);
        hm.setContent(hmContent);
        hm.setTitle(hmTitle);
        homeworkjdbc.addHomework(hm);

    }


}
