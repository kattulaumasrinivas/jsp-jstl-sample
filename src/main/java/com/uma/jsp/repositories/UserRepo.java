package com.uma.jsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.uma.jsp.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
