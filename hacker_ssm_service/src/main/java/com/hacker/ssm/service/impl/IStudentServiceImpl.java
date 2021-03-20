package com.hacker.ssm.service.impl;

import com.hacker.ssm.Student;
import com.hacker.ssm.dao.IStudentDao;
import com.hacker.ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao StudentDao;

    public List<Student> findAll() throws Exception {
        return StudentDao.findAll();
    }
}
