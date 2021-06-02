package com.registration.Controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registration.entity.User;
import com.registration.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		userService.addUser(user);
		return user;
	}
	
	
	@PostMapping("/login")
	public String loginUser(@RequestBody User user) {
		String result = userService.loginUser(user);
		return result;
	}
	
	
	@PostMapping("/permu/{string}")
	public Set<String> purmutationStrings(@PathVariable("string") String string){
		List<String> list = userService.permutationStrings(string);
		Set<String> set = new HashSet<>();
		for(String s: list) {
			set.add(s);
		}
		return set;
	}
	
}
