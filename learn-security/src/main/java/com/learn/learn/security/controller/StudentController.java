package com.learn.learn.security.controller;


import com.learn.learn.security.model.Student;
import com.learn.learn.security.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    private static List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Ajith",60),
            new Student(2,"Anoop",70)

    ));

    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return " hii "+ request.getSession().getId();
    }

    @GetMapping("/s")
    public List<Student> getStudents(){
        System.out.println("students");
        return studentService.getAllStudents();
    }


    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }


    @GetMapping("/getCsrf")
    public CsrfToken getCsrf(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }


}
