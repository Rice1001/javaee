package org.example.spring.dao;

import org.example.spring.model.Homework;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/22 23:00
 */
public interface HomeworkDao {

    /**
     *
     * 往homework表中插入一个数据项
     * @param hm 被添加的数据项
     * @return 查询成功 返回 true，失败返回 false
     */
    public Boolean doAdd(Homework hm);

    /**
     * 查询s_homework表中所有的数据项
     * @return 返回查询查询到的数据项
     */
    public List<Homework> findAll();
}
