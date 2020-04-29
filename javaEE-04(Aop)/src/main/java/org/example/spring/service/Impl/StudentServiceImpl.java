package org.example.spring.service.Impl;

import org.example.spring.Database.DatabasePool;
import org.example.spring.dao.factory.DaoFactory;
import org.example.spring.model.Student;
import org.example.spring.service.StudentService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/23 17:55
 */
@Component
public class StudentServiceImpl implements StudentService {

    @Override
    public Boolean insert(Student s) {
        try{
            return DaoFactory.getStudentDaoInstance(DatabasePool.getHikariDataSource().getConnection()).doAdd(s);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Student> selectAll() {
        try{
            return DaoFactory.getStudentDaoInstance(DatabasePool.getHikariDataSource().getConnection()).findAll();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
