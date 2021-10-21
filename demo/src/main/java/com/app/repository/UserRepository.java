package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	@Query(value="SELECT u FROM UserEntity u WHERE u.firstName LIKE ?1")
	List<UserEntity> findByFirstName(String firstName);
}
