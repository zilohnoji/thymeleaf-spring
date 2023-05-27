package com.donatoordep.springth.dto;

import com.donatoordep.springth.entities.UserEntity;
import com.donatoordep.springth.utils.ConversibleContract;

public class UserDTO implements ConversibleContract<UserEntity> {

	public Long id;
	public String name;
	public String email;
	private String password;

	public UserDTO() {
	}

	public UserDTO(UserEntity entity) {
		if (entity != null) {
			this.id = entity.getId();
			this.name = entity.getName();
			this.email = entity.getEmail();
			this.password = entity.getPassword();
		}
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
	public UserEntity convertFrom() {
		return new UserEntity(this);
	}

}
