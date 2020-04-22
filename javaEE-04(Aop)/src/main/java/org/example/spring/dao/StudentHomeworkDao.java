package org.example.spring.dao;

import org.example.spring.model.StudentHomework;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/22 23:01
 */
public interface StudentHomeworkDao {

    /**
     *
     * 添加一个数据对象
     * @param studentHomework 被添加的对象
     * @return 返回查询状态
     */
    public Boolean addStudentHomework(StudentHomework studentHomework);

    /**
     *
     * 查询所有数据对象
     * @return 返回查询对象
     */
    public List<StudentHomework> selectAll();
}
