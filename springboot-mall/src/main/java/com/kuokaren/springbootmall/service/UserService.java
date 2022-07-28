package com.kuokaren.springbootmall.service;

import com.kuokaren.springbootmall.dto.UserLoginRequest;
import com.kuokaren.springbootmall.dto.UserRegisterRequest;
import com.kuokaren.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
