package org.example.spring.service.Impl;

import org.example.spring.Database.DatabasePool;
import org.example.spring.dao.factory.DaoFactory;
import org.example.spring.model.StudentHomework;
import org.example.spring.service.StudentHomeworkService;
import org.example.spring.service.factory.ServiceFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/29 19:23
 */
@Component
public class StudentHomeworkServiceImpl implements StudentHomeworkService {
    @Override
    public boolean doAdd(StudentHomework sh) {
        try{
            return DaoFactory.getStudentHomeworkDaoInstance(DatabasePool.getHikariDataSource().getConnection()).doAdd(sh);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<StudentHomework> selectAll() {
       try{
           return DaoFactory.getStudentHomeworkDaoInstance(DatabasePool.getHikariDataSource().getConnection()).selectAll();
       }catch (Exception e){
           e.printStackTrace();
       }
        return null;
    }
}
