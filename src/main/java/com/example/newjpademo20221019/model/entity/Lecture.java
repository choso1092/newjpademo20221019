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
public class Lecture {

    @Id
    private int idlecture;
    private String lectureName;
    private String lecturePlace;

    // 1 : N
    @OneToMany(fetch = FetchType.LAZY , mappedBy = "lecture")
    private List<Application> applicationList;
}

