package org.example.spring.dao.Impl;

import org.example.spring.dao.StudentDao;
import org.example.spring.model.Student;
import org.example.spring.Database.DatabasePool;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/22 22:53
 */
@Component
public class StudentDaoImp implements StudentDao {

    private Connection connection;

    /**
     *
     * 初始化connection
     * @param connection
     */
    public void setConnection(Connection connection){
        this.connection = connection;
    }

    /*public StudentDaoImp(Connection connection){
        this.connection = connection;
    }*/

    @Override
    public Boolean doAdd(Student s){
        String sqlString = "insert into s_student(id,name,create_time) values(?,?,?)";
        try(PreparedStatement ps = connection.prepareStatement(sqlString)){
            ps.setLong(1,s.getId());
            ps.setString(2,s.getName());
            ps.setTimestamp(3,new Timestamp(System.currentTimeMillis()));
            ps.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return  false;
    }

    @Override
    public List<Student> findAll() {
        String sqlString = "select * from s_student";
        List<Student> list = new ArrayList<Student>();
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
        catch (SQLException e){
            e.printStackTrace();
        }

        return list;
    }
}
