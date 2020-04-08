package org.example.spring.mvc.controller;

import org.example.spring.mvc.jdbc.Studentjdbc;
import org.example.spring.mvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/8 10:17
 */
@Controller
public class AddStudentController {

    @RequestMapping(value = "/addStudentUrl", method = RequestMethod.POST)
    public String addStudent(@RequestParam("id") Long userId, @RequestParam("name") String userName){
        Student s = new Student();
        s.setId(userId);
        s.setName(userName);
        System.out.println(s.getName()+s.getId());
        if(Studentjdbc.addStudent(s))
            return "/success.jsp";
        else
            return "/fail.jsp";
    }

}
