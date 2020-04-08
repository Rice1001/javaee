package org.example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/8 15:03
 */
@Controller
public class JumpController {

    @RequestMapping("/addTo")
    public String jumpToAdd(){
        return "/add.jsp";
    }

    @RequestMapping("/display")
    public String jumpToDisplay(){
        return "/index.jsp";
    }

    @RequestMapping("/submitHomework")
    public String jumpToSubmit(){
        return "/submitHomework.jsp";
    }
}
