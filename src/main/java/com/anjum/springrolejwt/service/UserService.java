package com.anjum.springrolejwt.service;

import java.util.List;

import com.anjum.springrolejwt.model.User;
import com.anjum.springrolejwt.model.UserDto;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
