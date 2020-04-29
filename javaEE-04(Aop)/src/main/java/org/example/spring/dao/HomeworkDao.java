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
     * ��homework���в���һ��������
     * @param hm ����ӵ�������
     * @return ��ѯ�ɹ� ���� true��ʧ�ܷ��� false
     */
    public Boolean doAdd(Homework hm);

    /**
     * ��ѯs_homework�������е�������
     * @return ���ز�ѯ��ѯ����������
     */
    public List<Homework> findAll();
}
