package com.example.newjpademo20221019.controller;

import com.example.newjpademo20221019.model.entity.Student;
import com.example.newjpademo20221019.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class getController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/save")  //localhost:8080/demo/save?id=1234&name=한나&department=유아교육학과
    public  String save(@RequestParam int id,
                        @RequestParam String name,
                        @RequestParam String department) {

        Student s = new Student();
        s.setIdstudent(id);
        s.setName(name);
        s.setDepartment(department);
        studentRepository.save(s);
        return "ok";
    }
}