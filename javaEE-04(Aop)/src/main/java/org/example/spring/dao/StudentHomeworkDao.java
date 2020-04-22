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
     * ���һ�����ݶ���
     * @param studentHomework ����ӵĶ���
     * @return ���ز�ѯ״̬
     */
    public Boolean addStudentHomework(StudentHomework studentHomework);

    /**
     *
     * ��ѯ�������ݶ���
     * @return ���ز�ѯ����
     */
    public List<StudentHomework> selectAll();
}
