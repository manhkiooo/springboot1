package com.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.app.converter.UserConverter;
import com.app.dto.UserDTO;
import com.app.entity.UserEntity;
import com.app.repository.UserRepository;
import com.app.service.IUserService;

@Service
public class UserService implements IUserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserConverter userConverter;
	@Override
	public UserDTO save(UserDTO userDTO) {
		try {
			System.out.println("id:  "+ userDTO.getId());
		} catch (Exception e) {
			
		}
		UserEntity userEntity;
		if(userDTO.getId() != null) {
			UserEntity oldUser = userRepository.findById(userDTO.getId()).get();
			userEntity = userConverter.toEntity(userDTO, oldUser);	
		}else {
			 userEntity = userConverter.toEntity(userDTO);
		}
		userEntity = userRepository.save(userEntity);
		return userConverter.toDTO(userEntity);
	}
	
	@Override
	public int deleteUser(long id) {
		try {
			userRepository.deleteById(id);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	@Override
	public List<UserDTO> findAll(Pageable pageable, String firtName) {
		List<UserDTO> result = new ArrayList<UserDTO>();
		List<UserEntity> listEntity = new ArrayList<UserEntity>();
		if(firtName.isEmpty())
			listEntity = userRepository.findAll(pageable).getContent();
		else
			listEntity = userRepository.findByFirstName("%"+firtName+"%");
		for (UserEntity userEntity : listEntity) {
			UserDTO userDTO = userConverter.toDTO(userEntity);
			result.add(userDTO);
		}
		return result;
		
	}
	@Override
	public int totalItem() {
		return (int) userRepository.count();
	}
}
