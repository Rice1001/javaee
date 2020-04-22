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
     *���ݿ����Ӳ�������s_student���в���һ������
     * @param student �������ݵĶ���
     * @return �ɹ����
     */
    public Boolean addStudent(Student student);

    /**
     *
     * ��ѯȫ������
     * @return  ���ز�ѯ���
     *
     */
    public List<Student> selectAll();




}
