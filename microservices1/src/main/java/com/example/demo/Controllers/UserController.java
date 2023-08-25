package com.example.demo.Controllers;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.service.UserService;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	private User createuser(@RequestBody User user) {
		return userService.saveUser(user);
		
	}
	
	@GetMapping
	public List<User> getUser(){
	LOGGER.info("Got all users");
	return userService.getAllUser();
	   

	}
	@GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id){
    LOGGER.info("User found at ID: " + id);
    return userService.getUser(id);
 }

}
