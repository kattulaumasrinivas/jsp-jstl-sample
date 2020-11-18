package com.uma.jsp.services;

import java.util.List;

import com.uma.jsp.entities.User;

public interface IUserService {
	
	User saveUser(User user);

	User updateUser(User user);

	void deleteUser(User user);

	User getUserById(int id);

	List<User> getAllUsers();

}
