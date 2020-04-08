package org.example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/8 9:00
 */

@Controller
public class EnterController {

    @RequestMapping("/first")
    public String testMain(){

        return "/main.jsp";
    }
}
