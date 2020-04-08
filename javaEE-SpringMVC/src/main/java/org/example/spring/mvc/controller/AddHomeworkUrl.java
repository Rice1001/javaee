package org.example.spring.mvc.controller;

import org.example.spring.mvc.jdbc.Homeworkjdbc;
import org.example.spring.mvc.model.Homework;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/8 17:22
 */
@Controller
public class AddHomeworkUrl {

    @RequestMapping(value = "/addHomeworkUrl", method = RequestMethod.POST)
    public String addHomework(@RequestParam("id") Long hmId,@RequestParam("title") String hmTitle, @RequestParam("content") String hmContent){
        Homework hm = new Homework();
        hm.setId(hmId);
        hm.setContent(hmContent);
        hm.setTitle(hmTitle);
        if(Homeworkjdbc.addHomework(hm))
            return "success.jsp";
        else
            return "fail.jsp";
    }
}
