package com.example.newjpademo20221019.repository;

import com.example.newjpademo20221019.model.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
