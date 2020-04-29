package org.example.spring.dao.factory;

import org.example.spring.dao.HomeworkDao;
import org.example.spring.dao.Impl.HomeworkDaoImp;
import org.example.spring.dao.Impl.StudentDaoImp;
import org.example.spring.dao.Impl.StudentHomeworkDaoImp;
import org.example.spring.dao.StudentDao;
import org.example.spring.dao.StudentHomeworkDao;
import org.example.spring.model.Homework;

import java.sql.Connection;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/29 15:32
 */

public class DaoFactory {
    public static StudentDao getStudentDaoInstance(Connection connection){
            return new StudentDaoImp(connection);
    }

    public static HomeworkDao getHomeworkDaoInstance(Connection connection){
        return new HomeworkDaoImp(connection);
    }

    public static StudentHomeworkDao getStudentHomeworkDaoInstance(Connection connection){
        return new StudentHomeworkDaoImp(connection);
    }
}
