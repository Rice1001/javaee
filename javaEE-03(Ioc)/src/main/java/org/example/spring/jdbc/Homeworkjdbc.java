package org.example.spring.jdbc;

import org.example.spring.model.Homework;
import org.springframework.context.annotation.Configuration;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/3/13 19:35
 */

@Configuration
public class Homeworkjdbc {

    private static String driveName = "com.mysql.cj.jdbc.Driver";


    /**
     * ��ѯ��ӵ���ҵ
     *
     */

    public  List<Homework> selectAll(){
        String sqlString = "select * from s_homework";
        List<Homework> list = new ArrayList<Homework>();
        try {
            Class.forName(driveName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection connection = DatabasePool.getHikariDataSource().getConnection()){
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
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return list;
    }


    /**
     *
     * �����ҵ
     */
    public  boolean addHomework(Homework hm)  {
        String sqlString = "insert into s_homework(id, title,content, create_time) values(?,?,?,?)";
        //��������
        try {
            Class.forName(driveName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try(Connection connection = DatabasePool.getHikariDataSource().getConnection()){
            try(PreparedStatement ps = connection.prepareStatement(sqlString)){
                ps.setLong(1,hm.getId());
                ps.setString(2,hm.getTitle());
                ps.setString(3,hm.getContent());
                ps.setTimestamp(4,new Timestamp(System.currentTimeMillis()));
                ps.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
