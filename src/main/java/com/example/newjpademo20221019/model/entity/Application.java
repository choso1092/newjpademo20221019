package com.example.newjpademo20221019.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = {"lecture", "student"})
public class Application {


    @Id
    private int idapplication;
    // private int student_idstudent;
    // private int lecture_idlecture;

    //private Long userId;
    // private Long itemId;

    // N : 1
    @ManyToOne
    private Student student;
    // N : 1
    @ManyToOne
    private Lecture lecture;
}
