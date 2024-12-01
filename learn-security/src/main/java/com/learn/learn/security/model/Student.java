package com.learn.learn.security.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    Integer id;
    String name;
    Integer marks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Student(Integer id, String name, Integer marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
