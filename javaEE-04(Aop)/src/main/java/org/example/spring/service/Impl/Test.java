package org.example.spring.service.Impl;

import org.example.spring.model.Homework;
import org.example.spring.model.Student;
import org.example.spring.model.StudentHomework;
import org.example.spring.service.factory.ServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/29 15:44
 */
public class Test {

    public static void main(String[] args) {
       /* //测试从数据库中查询
        List<Student> list = ServiceFactory.getStudentService().selectAll();
        for(Student s:list){
            System.out.println(s.getName());
        }*/

        /*//测试往表中插入student
        Student s = new Student();
        s.setName("xiaoMing");
        s.setId(101);
        System.out.println(ServiceFactory.getStudentService().insert(s));*/
        // test the check function

       /* List<Homework> list = ServiceFactory.getHomeworkService().selectAll();
        for(Homework hm:list){
            System.out.println(hm.getId());
        }

        //test the insert homework function
        Homework h = new Homework();
        h.setId(107);
        h.setContent("https://zhihu.com");
        h.setTitle("作业8");
        System.out.println(ServiceFactory.getHomeworkService().doAdd(h));*/

        List<StudentHomework> list = ServiceFactory.getStudentHomeworkService().selectAll();
        for(StudentHomework sh:list){
            System.out.println(sh.getId());
        }

      /*  //test the insert homework function
        StudentHomework sh = new StudentHomework();
        sh.setId(107);
        sh.setStudentId(1125);
        sh.setHomeworkContent("https://baidu.com");
        sh.setHomeworkTitle("作业12");
        System.out.println(ServiceFactory.getStudentHomeworkService().doAdd(sh));*/

    }
}
