package com.jconf.workshop.service;

import com.jconf.workshop.model.User;

public sealed interface UserService permits UserServiceImpl{
    User createUser(User user);

    User getUserById(Long id);

    User getUserByCode(String code);
}
