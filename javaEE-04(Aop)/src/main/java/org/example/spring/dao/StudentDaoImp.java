package org.example.spring.dao;

import org.example.spring.model.Student;
import org.example.spring.service.DatabasePool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/22 22:53
 */
public class StudentDaoImp implements StudentDao{

    private static String driveName = "com.mysql.cj.jdbc.Driver";

    @Override
    public Boolean addStudent(Student s){
        String sqlString = "insert into s_student(id,name,create_time) values(?,?,?)";
        //创建驱动
        try {
            Class.forName(driveName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection connection = DatabasePool.getHikariDataSource().getConnection()){
            try(PreparedStatement ps = connection.prepareStatement(sqlString)){
                ps.setLong(1,s.getId());
                ps.setString(2,s.getName());
                ps.setTimestamp(3,new Timestamp(System.currentTimeMillis()));
                ps.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  false;
    }

    @Override
    public List<Student> selectAll() {
        String sqlString = "select * from s_student";
        List<Student> list = new ArrayList<Student>();
        //创建连接
        try {
            Class.forName(driveName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try(Connection connection = DatabasePool.getHikariDataSource().getConnection()){
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sqlString)){
                    while(resultSet.next()){
                        Student s = new Student();
                        s.setId(resultSet.getLong("id"));
                        s.setName(resultSet.getString("name"));
                        s.setCreateTime(resultSet.getTimestamp("create_time"));
                        list.add(s);
                    }
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return list;
    }
}
