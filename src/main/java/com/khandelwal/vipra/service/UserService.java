package com.khandelwal.vipra.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.khandelwal.vipra.model.User;

public interface UserService {

	
	public User save(User u);
	public User update(User u);
	public List<User> getAllUser();
	public void  deleteUser(String userId);
	public List<User> getUserByName(String name);
	public User getUser(String id);
}
