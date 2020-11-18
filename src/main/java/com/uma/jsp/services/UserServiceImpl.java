package com.uma.jsp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uma.jsp.entities.User;
import com.uma.jsp.repositories.UserRepo;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(User user) {
		userRepo.delete(user);
	}

	@Override
	public User getUserById(int id) {
		Optional<User> users = userRepo.findById(id);
		if(users.isPresent()) {
			return users.get();
		}
		else {
			return null;
		}
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

}
