package com.app.service;
import java.util.List;

import org.springframework.data.domain.Pageable;

import com.app.dto.UserDTO;

public interface IUserService  {
	UserDTO save(UserDTO userDTO);
	int deleteUser(long id);
	List<UserDTO> findAll(Pageable pageable, String firtName);
	int totalItem();
	
}
