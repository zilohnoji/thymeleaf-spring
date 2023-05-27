package com.donatoordep.springth.entities;

import java.io.Serializable;

import com.donatoordep.springth.dto.UserDTO;
import com.donatoordep.springth.utils.ConversibleContract;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_tb")
public class UserEntity implements Serializable, ConversibleContract<UserDTO> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public String name;
	public String email;
	private String password;

	public UserEntity() {
	}

	public UserEntity(UserDTO dto) {
		this.name = dto.getName();
		this.email = dto.getEmail();
		this.id = dto.getId();
		this.password = dto.getPassword();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	@Override
	public UserDTO convertFrom() {
		return new UserDTO(this);
	}

}
