package com.jconf.workshop.controller;

import com.jconf.workshop.config.UserCountryConfig;
import com.jconf.workshop.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target="settings", source = "userCountryConfig")
    User dtoToModel(UserRecordDto userRecordDto, UserCountryConfig userCountryConfig);

    UserRecordDto modelToDto(User user);
}
