package com.example.newjpademo20221019.repository;

import com.example.newjpademo20221019.Newjpademo20221019ApplicationTests;
import com.example.newjpademo20221019.model.entity.Lecture;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Optional;

public class LectureRepositoryTest extends Newjpademo20221019ApplicationTests {
    // Dependency Injection (DI)
    @Autowired
    private LectureRepository lectureRepository;

    @Test
    @Transactional
    public void read() {
        //  Optional<Lecture> user = lectureRepository.findById(1);
        Optional<Lecture> user = lectureRepository.findByLectureName("java");
        user.ifPresent(selectUser->{
            selectUser.getApplicationList().stream().forEach(detail->{
                System.out.println(detail.getStudent());
            });
        });
    }
}
