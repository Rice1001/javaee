package org.example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/3 21:47
 */
@RequestMapping("/api/")
@Controller
public class ApiController {

    @RequestMapping("test")
    public String testApi(){
        return "/index.jsp";
    }
}
