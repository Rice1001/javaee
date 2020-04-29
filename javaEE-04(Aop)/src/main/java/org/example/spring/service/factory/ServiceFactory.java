package org.example.spring.service.factory;

import org.example.spring.service.HomeworkService;
import org.example.spring.service.Impl.HomeworkServiceImpl;
import org.example.spring.service.Impl.StudentHomeworkServiceImpl;
import org.example.spring.service.Impl.StudentServiceImpl;
import org.example.spring.service.StudentHomeworkService;
import org.example.spring.service.StudentService;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/29 15:42
 */
public class ServiceFactory {

    public static StudentService getStudentService(){
        return new StudentServiceImpl();
    }

    public static HomeworkService getHomeworkService(){
        return  new HomeworkServiceImpl();
    }

    public static StudentHomeworkService getStudentHomeworkService(){
        return  new StudentHomeworkServiceImpl();
    }
}
