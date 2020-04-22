package org.example.spring.dao;

import org.example.spring.model.Student;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/22 22:53
 */
public interface StudentDao {


    /**
     *
     *数据库增加操作，往s_student表中插入一个数据
     * @param student 增加数据的对象
     * @return 成功标记
     */
    public Boolean addStudent(Student student);

    /**
     *
     * 查询全部数据
     * @return  返回查询结果
     *
     */
    public List<Student> selectAll();




}
