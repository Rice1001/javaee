package org.example.spring.service.Impl;

import org.example.spring.Database.DatabasePool;
import org.example.spring.dao.HomeworkDao;
import org.example.spring.dao.Impl.HomeworkDaoImp;
import org.example.spring.model.Homework;
import org.example.spring.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.util.List;
import java.util.Objects;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/29 18:33
 */

@Component
@ComponentScan("org.example.spring.dao.*")
public class HomeworkServiceImpl implements HomeworkService {

    @Autowired
    private HomeworkDaoImp homeworkDaoImp ;

    @Override
    public Boolean addHomework(Homework hm) {
        try{
            Connection connection = DatabasePool.getHikariDataSource().getConnection();
            homeworkDaoImp.setConnection(connection);
            return homeworkDaoImp.doAdd(hm);
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Homework> selectAll() {
        try{
            Connection connection = DatabasePool.getHikariDataSource().getConnection();
            homeworkDaoImp.setConnection(connection);
            return homeworkDaoImp.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
