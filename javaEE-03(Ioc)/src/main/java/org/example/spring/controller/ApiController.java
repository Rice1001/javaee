package org.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/13 21:55
 */

@Controller
public class ApiController {

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

    @RequestMapping("/first")
    public String testMain(){

        return "/main.jsp";
    }

}
