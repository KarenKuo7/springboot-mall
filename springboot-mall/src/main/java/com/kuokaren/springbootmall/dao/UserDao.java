package com.kuokaren.springbootmall.dao;

import com.kuokaren.springbootmall.dto.UserRegisterRequest;
import com.kuokaren.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest) ;

    User getUserById(Integer userId);
}
