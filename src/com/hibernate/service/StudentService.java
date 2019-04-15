package com.hibernate.service;/*
  author:huyao
  date:2019/4/11
  */

import com.hibernate.entity.Student;
import com.hibernate.page.Page;

import java.util.List;

/**
 * 业务接口
 * @author pc
 *
 */
public interface StudentService {

    /**
     * 2.添加
     * @param stu
     * @return
     */
    int save(Student stu);

    /**
     * 3.查询所有
     */
    List<Student> findAll();
    /**
     * 4.根据主键id查询
     * @param sid
     * @return
     */
    Student findById(Integer sid);
    /**
     * 5.修改
     */
    int update(Student stu);
    /**
     * 6.删除
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

