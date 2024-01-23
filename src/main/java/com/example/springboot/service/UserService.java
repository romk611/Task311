package com.example.springboot.service;

import com.example.springboot.model.User;
import com.example.springboot.repositori.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao;
    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User findById(Long id){
        return userDao.getOne(id);
    }

    public List<User> findAll(){
        return userDao.findAll();
    }

    public User saveUser(User user){
        return userDao.save(user);
    }

    public void deleteById(Long id){
        userDao.deleteById(id);
    }

    public void updateUser(User user){
        userDao.saveAndFlush(user);
    }
}
