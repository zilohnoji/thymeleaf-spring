package com.donatoordep.springth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.donatoordep.springth.dto.UserDTO;
import com.donatoordep.springth.entities.UserEntity;
import com.donatoordep.springth.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService implements GenericService<UserEntity, Long, UserDTO> {

	@Autowired
	UserRepository repository;
	
	@Override
	public JpaRepository<UserEntity, Long> repository() {
		return repository;
	}

}
