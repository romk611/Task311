package com.example.task311.dao;


import com.example.task311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {


}
