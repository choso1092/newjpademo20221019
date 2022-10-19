package com.example.newjpademo20221019.repository;

import com.example.newjpademo20221019.Newjpademo20221019ApplicationTests;
import com.example.newjpademo20221019.model.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentRepositoryTest extends Newjpademo20221019ApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void create(){
        Student stu = new Student();
        stu.setIdstudent(4444);
        stu.setName("최치수");
        stu.setDepartment("경영학과");
        studentRepository.save(stu);
    }
}
