package com.jconf.workshop.service;

import com.jconf.workshop.model.User;
import com.jconf.workshop.repository.UserEntityMapper;
import com.jconf.workshop.repository.UserRepository;
import com.jconf.workshop.repository.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public non-sealed class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    private final UserEntityMapper userEntityMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User getUserById(Long id) {
        return this.userEntityMapper.entityToModel(this.userRepository.findById(id).orElseThrow());
    }

    @Override
    public User getUserByCode(String code) {
        return  this.userEntityMapper.recordToModel(this.userRepository.findByCode(code));
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntitySaved = this.userRepository.save(this.userEntityMapper.modelToEntity(user));
        return this.userEntityMapper.entityToModel(userEntitySaved);
    }


}
