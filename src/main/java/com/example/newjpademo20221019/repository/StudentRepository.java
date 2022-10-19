package com.example.newjpademo20221019.repository;

import com.example.newjpademo20221019.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // select * from user where account = ? << test03, test04
    // Optional<Lecture> findByAccount(String account);

    // select * from user where email = ?
    // Optional<Lecture> findByEmail(String email);

    // select * from user where account = ? and email = ?
    // Optional<Lecture> findByAccountAndEmail(String account, String email);

    //    Optional<User> findByAccountAndEmail(String ac ,String em);
    // 순서대로 매칭되기 때문에! String account로 하지 않아도 됨
    //findByAccountAndEmail 여기 by 뒤에 있는 단어와 순서대로 매칭되니까~ 걱정안해두됨!
    // 즉 ac, e 이렇게 참조 변수 만들어두됨
}
