package com.hibernate.service.impl;/*
  author:huyao
  date:2019/4/11
  */

import com.hibernate.dao.StudentDao;
import com.hibernate.dao.impl.StudentDaoImpl;
import com.hibernate.entity.Student;
import com.hibernate.page.Page;
import com.hibernate.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    /**
     * 使用多态引用数据访问层对象
     */
    private StudentDao dao = new StudentDaoImpl();
    @Override
    public int save(Student stu) {
            // TODO Auto-generated method stub
            return dao.save(stu);
        }

    public int delete(Student stu) {
        // TODO Auto-generated method stub
        return dao.delete(stu);
    }

    public List<Student> findAll() {
        // TODO Auto-generated method stub
        return dao.findAll();
    }

    public Student findById(Integer sid) {
        // TODO Auto-generated method stub
        return dao.findById(sid);
    }



    public int update(Student stu) {
        // TODO Auto-generated method stub
        return dao.update(stu);
    }

    public List<Student> findPage(Page page) {
        // TODO Auto-generated method stub
        return dao.findPage(page);
    }

    public int getTotalCount() {
        // TODO Auto-generated method stub
        return dao.getTotalCount();
    }


}

