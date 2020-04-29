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
     *���ݿ����Ӳ�������s_student���в���һ��������
     * @param student ���ӵ�������
     * @return ��ӳɹ�������true�����ʧ�ܣ�����false
     */
    public Boolean doAdd(Student student);

    /**
     *
     * ��ѯs_student�������е�������
     * @return  ���б����ʽ���ز�ѯ����������
     *
     */
    public List<Student> findAll();




}
