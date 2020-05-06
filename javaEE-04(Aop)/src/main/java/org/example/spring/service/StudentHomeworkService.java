package org.example.spring.service;

import org.example.spring.model.StudentHomework;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/29 19:01
 */
public interface StudentHomeworkService {

    /**
     *
     *insert into the studentHomework item into the s_student_homework table
     * @param sh added data item
     * @return add successfully. return true;else,return false;
     */
    public boolean insert(StudentHomework sh);


    /**
     *
     * select the all data item from the s_student_homework table
     * @return return the all data item in list form
     */
    public List<StudentHomework> selectAll();
}
