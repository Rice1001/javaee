package org.example.spring.dao.Impl;

import org.example.spring.dao.HomeworkDao;
import org.example.spring.model.Homework;
import org.example.spring.Database.DatabasePool;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/22 23:01
 */

@Component
public class HomeworkDaoImp implements HomeworkDao {
    private Connection connection;


    /**
     *
     * 初始化connection
     * @param connection
     */
    public void setConnection(Connection connection){
        this.connection = connection;
    }
    @Override
    public Boolean doAdd(Homework hm) {
        String sqlString = "insert into s_homework(id, title,content, create_time) values(?,?,?,?)";
        try(PreparedStatement ps = connection.prepareStatement(sqlString)){
            ps.setLong(1,hm.getId());
            ps.setString(2,hm.getTitle());
            ps.setString(3,hm.getContent());
            ps.setTimestamp(4,new Timestamp(System.currentTimeMillis()));
            ps.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Homework> findAll() {
        String sqlString = "select * from s_homework";
        List<Homework> list = new ArrayList<Homework>();
            try(Statement statement = connection.createStatement()){
                try(ResultSet rs = statement.executeQuery(sqlString)){
                    while(rs.next()){
                        Homework hm = new Homework();
                        hm.setId(rs.getLong("id"));
                        hm.setTitle(rs.getString("title"));
                        hm.setContent(rs.getString("content"));
                        hm.setCreate_time(rs.getTimestamp("create_time"));
                        list.add(hm);
                    }
                }
            }catch (SQLException e) {
            e.printStackTrace();
            }
        return list;
    }
}
