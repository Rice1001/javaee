package org.example.spring.service.Impl;

import org.example.spring.Database.DatabasePool;
import org.example.spring.dao.Impl.StudentHomeworkDaoImp;
import org.example.spring.model.StudentHomework;
import org.example.spring.service.StudentHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/29 19:23
 */
@Component
public class StudentHomeworkServiceImpl implements StudentHomeworkService {

    @Autowired
    StudentHomeworkDaoImp studentHomeworkDaoImp;
    @Override
    public boolean insert(StudentHomework sh) {
        try{
            studentHomeworkDaoImp.setConnection(DatabasePool.getHikariDataSource().getConnection());
            return studentHomeworkDaoImp.doAdd(sh);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<StudentHomework> selectAll() {
       try{
           studentHomeworkDaoImp.setConnection(DatabasePool.getHikariDataSource().getConnection());
           return studentHomeworkDaoImp.selectAll();
       }catch (Exception e){
           e.printStackTrace();
       }
        return null;
    }
}
