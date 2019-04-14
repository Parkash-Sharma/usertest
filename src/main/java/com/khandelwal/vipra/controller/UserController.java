package com.khandelwal.vipra.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khandelwal.vipra.model.User;
import com.khandelwal.vipra.repository.UserRepository;
import com.khandelwal.vipra.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	  private UserRepository repository;
	@Autowired
	private UserService userService;
		
	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public  List<User> getAll() {
	  return userService.getAllUser();
	}

	@RequestMapping(value = "/getUserByName/{name}", method = RequestMethod.GET)
	public  List<User> getUser(@PathVariable String name) {
	  return userService.getUserByName(name);
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.PUT)
	public  ResponseEntity<User>  saveUser(@Valid @RequestBody User user) {
		
	  return ResponseEntity.ok(userService.save(user));
	}
	
	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.PUT)
	public  User updateUser(@Valid @RequestBody User user) {
		
	  return userService.save(user);
	}
	
	@RequestMapping(value="/deleteUser/{_id}", method= RequestMethod.DELETE)
	public String deleteUser(@PathVariable("_id") String userId){
		
         userService.deleteUser(userId);
         
         return "user deleted";
	}
	
	@RequestMapping(value = "/getUser/{_id}", method = RequestMethod.GET)
	public  List<User> getUserById(@PathVariable("_id") String id) {
	  return (List<User>) userService.getUser(id);
	}
	
}
