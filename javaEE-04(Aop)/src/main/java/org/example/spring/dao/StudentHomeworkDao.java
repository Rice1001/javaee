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
     * ��s_studentHomework�������һ��������
     * @param studentHomework ����ӵ�������
     * @return ��ӳɹ�������true�����ʧ�ܣ�����false
     */
    public Boolean doAdd(StudentHomework studentHomework);

    /**
     *
     * ��ѯs_studentHomework�������е�������
     * @return ���ز�ѯ��������
     */
    public List<StudentHomework> selectAll();
}
