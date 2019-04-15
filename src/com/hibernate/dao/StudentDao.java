package com.hibernate.dao;/*
  author:huyao
  date:2019/4/11
  */

import com.hibernate.entity.Student;
import com.hibernate.page.Page;

import java.util.List;

public interface StudentDao {

    /**
     * 2.延时加载:查询所有
     * @return
     */
    List<Student> findAll();
    /**
     * 3.添加
     * @param stu
     * @return
     */
    int save(Student stu);
    /**
     * 4.根据主键id查询单条
     * @param sid
     * @return
     */
    Student findById(Integer sid);
    /**
     * 5.修改
     */
    int update(Student stu);
    /**
     * 6.删除对象
     * @param stu
     * @return
     */
    int delete(Student stu);
    /**
     * 7.分页查询
     */
    List<Student> findPage(Page page);
    /**
     * 8.查询总条数
     */
    int getTotalCount();


}

