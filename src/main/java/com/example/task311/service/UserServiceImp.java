package com.example.task311.service;

import com.example.task311.dao.UserDao;
import com.example.task311.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {


    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUser() {
        return userDao.findAll();
    }

    @Override
    public User getUserById(long id) {
        User user = null;
        Optional<User>optional = userDao.findById(id);
        if(optional.isPresent()){
            user = optional.get();
        }
        return user;
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userDao.deleteById(id);
    }

    @Override
    public void editUser(User user) {
        userDao.save(user);
    }
}
