package com.learn.learn.security.repository;

import com.learn.learn.security.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
