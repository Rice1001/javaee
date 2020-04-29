package org.example.spring.service;

import org.example.spring.model.Homework;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/29 18:25
 */
public interface HomeworkService {

    /**
     *
     * insert a homework item into the s_homework table
     * @param hm added data item
     * @return add successful, return true; else,return false
     */
    public Boolean doAdd(Homework hm);

    /**
     *
     * check the all data from the s_homework table
     * @return  return the all data byu list form
     */
    public List<Homework> selectAll();
}
