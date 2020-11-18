package com.uma.jsp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uma.jsp.entities.User;
import com.uma.jsp.services.IUserService;


@Controller
public class UserController {
	
	@Autowired
	IUserService userService;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createUser";
	}

	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		User userSaved = userService.saveUser(user);
		String msg = "User saved with id: " + userSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createUser";
	}

	@RequestMapping("/displayUsers")
	public String displayUsers(ModelMap modelMap) {
		List<User> users = userService.getAllUsers();
		modelMap.addAttribute("users", users);
		return "displayUsers";
	}

	@RequestMapping("deleteUser")
	public String deleteUser(@RequestParam("id") int id, ModelMap modelMap) {
		// User user = userService.getUserById(id);
		User user = new User();
		user.setId(id);
		userService.deleteUser(user);
		List<User> users = userService.getAllUsers();
		modelMap.addAttribute("users", users);
		return "displayUsers";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		User user = userService.getUserById(id);
		modelMap.addAttribute("user", user);
		return "updateUser";
	}

	@RequestMapping("/updateUser")
	public String updateUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		userService.updateUser(user);
		List<User> users = userService.getAllUsers();
		modelMap.addAttribute("users", users);
		return "displayUsers";
	}

}
