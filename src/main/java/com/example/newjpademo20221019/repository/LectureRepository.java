package com.example.newjpademo20221019.repository;

import com.example.newjpademo20221019.model.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Integer> {
    Optional<Lecture> findByLectureName(String lectureName);
}
