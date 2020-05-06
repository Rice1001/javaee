package org.example.spring.controller;

import org.example.spring.model.Homework;
import org.example.spring.service.Impl.HomeworkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/5/2 14:48
 */

@Controller
public class Test {
    @Autowired
    HomeworkServiceImpl homeworkServiceImpl;

    @RequestMapping("/test")
    public String printHomework(){
        List<Homework> list = homeworkServiceImpl.selectAll();
        for(Homework h : list){
            System.out.println(h.getId());
         }
        return "index.jsp";
    }


}
