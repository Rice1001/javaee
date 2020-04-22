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
     * 添加一个数据对象
     * @param hm 被添加的数据对象
     * @return 返回查询状态
     */
    public Boolean addHomework(Homework hm);

    /**
     * c查询所有结果
     * @return 返回查询对象
     */
    public List<Homework> selectAll();
}
