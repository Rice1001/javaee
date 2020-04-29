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
     *数据库增加操作，往s_student表中插入一个数据项
     * @param student 增加的数据项
     * @return 添加成功，返回true；添加失败，返回false
     */
    public Boolean doAdd(Student student);

    /**
     *
     * 查询s_student表中所有的数据项
     * @return  以列表的形式返回查询到的数据项
     *
     */
    public List<Student> findAll();




}
