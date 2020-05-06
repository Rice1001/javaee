package org.example.spring.dao.Impl;

import org.example.spring.dao.StudentHomeworkDao;
import org.example.spring.model.StudentHomework;
import org.example.spring.Database.DatabasePool;
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
public class StudentHomeworkDaoImp implements StudentHomeworkDao {

    private Connection connection;

    /**
     *
     * 初始化connection
     * @param connection
     */
    public void setConnection(Connection connection){
        this.connection = connection;
    }

/*
    public StudentHomeworkDaoImp(Connection connection){
        this.connection = connection;
    }
*/
    @Override
    public Boolean doAdd(StudentHomework sh) {
        String sqlString = "insert into s_student_homework" +
                           "( `student_id`, `homework_id`, `homework_title`, `homework_content`, `create_time`)" +
                           "values (?,?,?,?,?)";

        try( PreparedStatement ps = connection.prepareStatement(sqlString)){
            ps.setLong(1,sh.getStudentId());
            ps.setLong(2,sh.getHomeworkId());
            ps.setString(3,sh.getHomeworkTitle());
            ps.setString(4,sh.getHomeworkContent());
            ps.setTimestamp(5,new Timestamp(System.currentTimeMillis()));
            ps.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return  false;

    }

    @Override
    public List<StudentHomework> selectAll() {
        String sqlString = "select *from s_student_homework";

        //创建一个列表储存结果
        List<StudentHomework> list = new ArrayList<StudentHomework>();
        //连接mysql获取数据,获取完毕以后关闭mysql连接
        try( Statement statement = connection.createStatement()){
            try(ResultSet resultSet = statement.executeQuery(sqlString)){
                while(resultSet.next()){
                    StudentHomework sh = new StudentHomework();
                    sh.setId(resultSet.getLong("id"));
                    sh.setHomeworkId(resultSet.getLong("homework_id"));
                    sh.setStudentId(resultSet.getLong("student_id"));
                    sh.setHomeworkTitle(resultSet.getString("homework_title"));
                    sh.setHomeworkContent(resultSet.getString("homework_content"));
                    sh.setCreateTime(resultSet.getTimestamp("create_time"));
                    list.add(sh);
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return  list;
    }
}
