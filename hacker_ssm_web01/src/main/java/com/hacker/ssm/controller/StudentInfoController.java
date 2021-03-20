package com.hacker.ssm.controller;


import com.hacker.ssm.Student;
import com.hacker.ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(path="/student")
public class StudentInfoController {

    @Autowired
    private IStudentService StudentService;

    @RequestMapping(path="/findAll.do")
    public ModelAndView finAll() throws Exception{
        ModelAndView mv=new ModelAndView();
        List<Student> all = StudentService.findAll();
        for (int i = 0; i <all.size() ; i++) {
            System.out.println(all.get(i).getName());
        }
        mv.addObject("studentinfo",all);
        mv.setViewName("student");
        return mv;

    }


}
