package org.example.spring.service.Impl;

import org.example.spring.Database.DatabasePool;
import org.example.spring.dao.Impl.StudentDaoImp;
import org.example.spring.model.Student;
import org.example.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/23 17:55
 */
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDaoImp studentDaoImp;
    @Override
    public Boolean insert(Student s) {
        try{
            studentDaoImp.setConnection(DatabasePool.getHikariDataSource().getConnection());
            return studentDaoImp.doAdd(s);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Student> selectAll() {
        try{
            studentDaoImp.setConnection(DatabasePool.getHikariDataSource().getConnection());
            return studentDaoImp.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
