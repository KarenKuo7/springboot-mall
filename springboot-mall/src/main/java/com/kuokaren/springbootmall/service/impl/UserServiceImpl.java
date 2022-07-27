package com.kuokaren.springbootmall.service.impl;


import com.kuokaren.springbootmall.dao.UserDao;
import com.kuokaren.springbootmall.dto.UserRegisterRequest;
import com.kuokaren.springbootmall.model.User;
import com.kuokaren.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest){
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
