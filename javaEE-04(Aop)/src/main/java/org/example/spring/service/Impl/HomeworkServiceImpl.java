package org.example.spring.service.Impl;

import org.example.spring.Database.DatabasePool;
import org.example.spring.dao.factory.DaoFactory;
import org.example.spring.model.Homework;
import org.example.spring.service.HomeworkService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/29 18:33
 */

@Component
public class HomeworkServiceImpl implements HomeworkService {


    @Override
    public Boolean doAdd(Homework hm) {
        try{
            return DaoFactory.getHomeworkDaoInstance(DatabasePool.getHikariDataSource().getConnection()).doAdd(hm);
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Homework> selectAll() {
        try{
           return DaoFactory.getHomeworkDaoInstance(DatabasePool.getHikariDataSource().getConnection()).findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
