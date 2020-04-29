package org.example.spring.service;

import org.example.spring.model.Student;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/23 17:50
 */
public interface StudentService {

    /**
     *
     * 调用StudentDao.doAdd()添加数据
     * @param s 被添加的数据项
     * @return 查询成功，返回true；查询失败，返回false
     */
    public Boolean insert(Student s);

    /**
     *
     * 调用StudentDao.findAll() 查询所有数据项
     * @return 以列表的形式返回查询到的数据项
     */
    public List<Student> selectAll();
}
