package com.hacker.ssm.dao;
import com.hacker.ssm.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface IStudentDao {

    @Select("select * from students")
    List<Student> findAll() throws Exception;

}
