package com.jconf.workshop.controller;

import com.jconf.workshop.config.UserCountryConfig;
import com.jconf.workshop.model.User;
import com.jconf.workshop.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    private final UserCountryConfig userCountryConfig;
    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserCountryConfig userCountryConfig, UserService userService, UserMapper userMapper) {
        this.userCountryConfig = userCountryConfig;
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserById(@PathVariable Long id){
        return this.userService.getUserById(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserByCode(@RequestParam String code){
        return this.userService.getUserByCode(code);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public User createUser(@Valid @RequestBody UserRecordDto userRecordDto){
        log.info("request {}", userRecordDto);
        log.info("configProperties {}", userCountryConfig);

        User user = this.userMapper.dtoToModel(userRecordDto, this.userCountryConfig);
        log.info("user {}", user);
        return this.userService.createUser(user);
    }

    /*
    @PostMapping(value="/class", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserClassDto createUserWithClass(@Valid @RequestBody UserClassDto userClassDto){
        return userClassDto;
    }
     */

}
