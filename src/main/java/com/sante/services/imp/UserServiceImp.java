package com.sante.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sante.dao.UserRepository;
import com.sante.entites.User;
import com.sante.services.UserService;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> uneConnexion(String username) {
		// TODO Auto-generated method stub		
		return  userRepository.findUser(username);
	}

	@Override
	public User enregistrement(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public int nombre() {
		// TODO Auto-generated method stub
		return userRepository.countUser();
	}
	

}
