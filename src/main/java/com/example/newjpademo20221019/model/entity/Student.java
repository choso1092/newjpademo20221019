package com.example.newjpademo20221019.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    private int idstudent;
    private String name;
    private String department;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<Application> applicationList;
}
