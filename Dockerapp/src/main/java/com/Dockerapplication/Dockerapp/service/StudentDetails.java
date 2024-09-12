package com.Dockerapplication.Dockerapp.service;

import com.Dockerapplication.Dockerapp.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Dockerapplication.Dockerapp.repository.StudentRepo;

import java.util.List;
import java.util.Optional;


@Service
public class StudentDetails implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public StudentEntity getMethod(Integer id) {
        Optional<StudentEntity> s = studentRepo.findById(id);
        if (s.isPresent()) {
            return s.get();
        }
        return null;
    }

    @Override
    public StudentEntity saveMethod(StudentEntity s) {
        StudentEntity st = studentRepo.save(s);
        return st;
    }

    @Override
    public List<StudentEntity> findAll() {
        List<StudentEntity> s = studentRepo.findAll();
        return s;
    }

    @Override
    public StudentEntity delete(Integer id) {
        Optional<StudentEntity> s = studentRepo.findById(id);
        if (s.isPresent()) {
            studentRepo.deleteById(id);
            return s.get();
        }
        return null;
    }
}


