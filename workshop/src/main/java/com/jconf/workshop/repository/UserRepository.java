package com.jconf.workshop.repository;

import com.jconf.workshop.repository.entities.UserEntity;
import com.jconf.workshop.repository.entities.UserRecordEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserRecordEntity findByCode(String code);

    @Query("SELECT new com.jconf.workshop.repository.entities.UserRecordEntity(b.id, b.code, b.name, b.score) " +
            "FROM UserEntity b WHERE b.id = :id")
    UserRecordEntity findUserById(@Param("id") Long id);
}
