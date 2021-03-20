package com.hacker.ssm.service;

import com.hacker.ssm.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll() throws Exception;
}
