package org.example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/3 16:20
 */
@Controller
@RequestMapping("/app/")

public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "/success.jsp";
    }

    @RequestMapping("test2")
    @ResponseBody
    public String test2(){
        return "/index2.jsp";
    }
}
