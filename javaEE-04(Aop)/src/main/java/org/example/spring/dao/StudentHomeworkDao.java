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
     * 往s_studentHomework表中添加一个数据项
     * @param studentHomework 被添加的数据项
     * @return 添加成功，返回true；添加失败，返回false
     */
    public Boolean doAdd(StudentHomework studentHomework);

    /**
     *
     * 查询s_studentHomework表中所有的数据项
     * @return 返回查询的数据项
     */
    public List<StudentHomework> selectAll();
}
