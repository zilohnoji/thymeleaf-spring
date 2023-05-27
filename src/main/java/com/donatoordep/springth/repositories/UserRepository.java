package com.donatoordep.springth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donatoordep.springth.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
