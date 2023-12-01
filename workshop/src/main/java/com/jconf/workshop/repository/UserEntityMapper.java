package com.jconf.workshop.repository;

import com.jconf.workshop.model.User;
import com.jconf.workshop.repository.entities.UserEntity;
import com.jconf.workshop.repository.entities.UserRecordEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    @Mapping(target="languages", source = "user.settings.language")
    UserEntity modelToEntity(User user);

    @Mapping(target="settings.language", source = "userEntity.languages")
    User entityToModel(UserEntity userEntity);

    @Mapping(target="settings.language", source = "userEntity.languages")
    User recordToModel(UserRecordEntity userEntity);

}
