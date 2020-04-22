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
     * ���һ�����ݶ���
     * @param hm ����ӵ����ݶ���
     * @return ���ز�ѯ״̬
     */
    public Boolean addHomework(Homework hm);

    /**
     * c��ѯ���н��
     * @return ���ز�ѯ����
     */
    public List<Homework> selectAll();
}
