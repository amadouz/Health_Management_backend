package com.sante.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sante.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value="Select id, nom, prenoms, username, password, token from user where contact = ?1", nativeQuery = true)
	List<User> findUser(String username);
	

	Optional<User> findByUsername(String username);

	@Query(value="Select count(username) from utilisateurs", nativeQuery = true)
	int countUser();
	
}
