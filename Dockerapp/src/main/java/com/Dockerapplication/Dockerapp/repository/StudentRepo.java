package com.Dockerapplication.Dockerapp.repository;

import com.Dockerapplication.Dockerapp.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {
}
