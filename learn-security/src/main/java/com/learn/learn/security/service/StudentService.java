package com.learn.learn.security.service;

import com.learn.learn.security.model.Student;
import com.learn.learn.security.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
