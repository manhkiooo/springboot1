package com.app.converter;

import org.springframework.stereotype.Component;

import com.app.dto.UserDTO;
import com.app.entity.UserEntity;

@Component
public class UserConverter {
	
	public UserEntity toEntity(UserDTO userDTO) {
		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName(userDTO.getFirstName());
		userEntity.setMiddleName(userDTO.getMiddleName());
		userEntity.setLastName(userDTO.getLastName());
		userEntity.setAddress(userDTO.getAddress());
		userEntity.setBirthDate(userDTO.getBirthDate());
		userEntity.setCreateDate(userDTO.getCreateDate());
		userEntity.setPassword(userDTO.getPassword());
		userEntity.setPhoneNumber(userDTO.getPhoneNumber());
		userEntity.setUpdateDate(userDTO.getUpdateDate());
		userEntity.setUserName(userDTO.getUserName());
		return userEntity;
		
	}
	
	public UserDTO toDTO(UserEntity userDTO) {
		UserDTO userEntity = new UserDTO();
		userEntity.setFirstName(userDTO.getFirstName());
		userEntity.setMiddleName(userDTO.getMiddleName());
		userEntity.setLastName(userDTO.getLastName());
		userEntity.setAddress(userDTO.getAddress());
		userEntity.setBirthDate(userDTO.getBirthDate());
		userEntity.setCreateDate(userDTO.getCreateDate());
		userEntity.setPassword(userDTO.getPassword());
		userEntity.setPhoneNumber(userDTO.getPhoneNumber());
		userEntity.setUpdateDate(userDTO.getUpdateDate());
		userEntity.setUserName(userDTO.getUserName());
		userEntity.setId(userDTO.getId());
		return userEntity;
		
	}
	
	public UserEntity toEntity(UserDTO userDTO, UserEntity userEntity) {
		userEntity.setFirstName(userDTO.getFirstName());
		userEntity.setMiddleName(userDTO.getMiddleName());
		userEntity.setLastName(userDTO.getLastName());
		userEntity.setAddress(userDTO.getAddress());
		userEntity.setBirthDate(userDTO.getBirthDate());
		userEntity.setCreateDate(userDTO.getCreateDate());
		userEntity.setPassword(userDTO.getPassword());
		userEntity.setPhoneNumber(userDTO.getPhoneNumber());
		userEntity.setUpdateDate(userDTO.getUpdateDate());
		userEntity.setUserName(userDTO.getUserName());
		return userEntity;
		
	}

}
