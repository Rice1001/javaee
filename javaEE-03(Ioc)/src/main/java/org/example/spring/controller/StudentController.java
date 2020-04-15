package org.example.spring.controller;

import org.example.spring.jdbc.Studentjdbc;
import org.example.spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/12 15:49
 */

@Controller
@RequestMapping("/student/")
public class StudentController {

    @Autowired
    private Student s;
    @Autowired
    Studentjdbc studentjdbc;

    @PostMapping("add")
    public void addStudent(@RequestParam("id") Long studentId,
                           @RequestParam("name") String studentName){
        s.setId(studentId);
        s.setName(studentName);
        studentjdbc.addStudent(s);
    }

}