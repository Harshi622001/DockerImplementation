package com.Dockerapplication.Dockerapp.controller;

import com.Dockerapplication.Dockerapp.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.Dockerapplication.Dockerapp.service.StudentService;

import java.util.List;

@RestController
public class StudentMap {

    @Value("${mycustomservicename}")
    private String name;

    @Autowired
    private StudentService studentService;

    @GetMapping("/get/{id}")

    public StudentEntity getMethod(@PathVariable("id") Integer id) {
//        StudentEntity s = studentService.getMethod(id);
        System.out.println(name);
        return new StudentEntity();
    }

    @PostMapping("/save")
    public StudentEntity saveMethod(@RequestBody StudentEntity s) {
        return studentService.saveMethod(s);

    }

    @GetMapping("/findall")
    public List<StudentEntity> findAll() {
        return studentService.findAll();

    }

    @DeleteMapping("/delete/{i}")
    public StudentEntity delete(@PathVariable("i") Integer id) {
        StudentEntity st = studentService.delete(id);
        return st;

    }

}

