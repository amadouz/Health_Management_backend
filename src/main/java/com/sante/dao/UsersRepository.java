package com.sante.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sante.entites.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Long>{
	User findByUsername(String contact);
}
