package com.learn.learn.security.repository;

import com.learn.learn.security.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer>{

    Users findByUserName(String username);
}
