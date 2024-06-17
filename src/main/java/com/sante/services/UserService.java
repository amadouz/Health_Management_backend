package com.sante.services;

import java.util.List;

import com.sante.entites.User;

public interface UserService {
	
	List<User> uneConnexion(String username);
	
	User enregistrement(User user);

	int nombre();
	
}
