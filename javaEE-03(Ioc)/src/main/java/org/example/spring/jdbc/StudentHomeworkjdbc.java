package org.example.spring.jdbc;

import org.example.spring.model.StudentHomework;
import org.springframework.context.annotation.Configuration;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/3/11 17:05
 */

@Configuration
public class StudentHomeworkjdbc {


    /**
     * 添加学生作业
     *
     * @param sh
     */
    public  boolean addStudentHomework(StudentHomework sh){
        String url = "jdbc:mysql://127.0.0.1:3306/school";

        String driveName = "com.mysql.cj.jdbc.Driver";

        String sqlString = "insert into s_student_homework" +
                "( `student_id`, `homework_id`, `homework_title`, `homework_content`, `create_time`)values (?,?,?,?,?)";
        try{
            //创建驱动
            Class.forName(driveName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try(Connection connection = DatabasePool.getHikariDataSource().getConnection()){
            try( PreparedStatement ps = connection.prepareStatement(sqlString)){
                ps.setLong(1,sh.getStudentId());
                ps.setLong(2,sh.getHomeworkId());
                ps.setString(3,sh.getHomeworkTitle());
                ps.setString(4,sh.getHomeworkContent());
                ps.setTimestamp(5,new Timestamp(System.currentTimeMillis()));
                ps.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  false;

    }

    /**
     * 选择所有学生的作业
     *
     * @return
     */
    public  List<StudentHomework> selectAll(){

        String url = "jdbc:mysql://127.0.0.1:3306/school";

        String driveName = "com.mysql.cj.jdbc.Driver";

        String sqlString = "select *from s_student_homework";
        try{
            //创建驱动
            Class.forName(driveName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        //创建一个列表储存结果
        List<StudentHomework> list = new ArrayList<StudentHomework>();
        //连接mysql获取数据,获取完毕以后关闭mysql连接
        try(Connection connection = DatabasePool.getHikariDataSource().getConnection()){
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
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  list;
    }

}
