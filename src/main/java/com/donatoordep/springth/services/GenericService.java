package com.donatoordep.springth.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.donatoordep.springth.utils.ConversibleContract;

import jakarta.transaction.Transactional;

@Service
@Transactional
public interface GenericService<E extends ConversibleContract<DTO>, ID, DTO extends ConversibleContract<E>> {

	JpaRepository<E, ID> repository();

	default public DTO insert(DTO dto) {
		return repository().save(dto.convertFrom()).convertFrom();
	}

	default public ModelAndView modelAll() {
		return new ModelAndView("register/registerUser").addObject("users", repository().findAll());
	}
}
