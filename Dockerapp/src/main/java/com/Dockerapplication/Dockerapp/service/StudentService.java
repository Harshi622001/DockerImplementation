package com.Dockerapplication.Dockerapp.service;

import com.Dockerapplication.Dockerapp.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentEntity getMethod(Integer id);

    StudentEntity saveMethod(StudentEntity s);

    List<StudentEntity> findAll();

    StudentEntity delete(Integer id);

}
