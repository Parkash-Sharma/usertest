package com.khandelwal.vipra.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.khandelwal.vipra.model.User;
import com.khandelwal.vipra.repository.UserRepository;
import com.khandelwal.vipra.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	

	@Autowired
	UserRepository repositery;
	@Autowired
	MongoTemplate mongoTemplate;
		    
	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		//return     repositery.save(new User("101", "self", "unMarried", "Parkash", "154-12-1990", "Hanumangarh", "2:10AM", "5.8", "Fair", "MCA", "Software developer", "sec 38 Gurgoan", 1000000, "Lal Chand", "Rameshwari Devi", "two elder brother", "Abohar", "Nawal,chotia", false, "Abohar", "9464755334", "7823456789", "parkashsharma33@gmail.com", "Nawal", "Choia", "hindi", "7-04-2019"));
		return repositery.save(user);
	}

	@Override
	public User update(User u) {
		// TODO Auto-generated method stub
		//return repositery.save(u);
		//return     repositery.save(new User("102","fdytrytr","reyrtytr","Parkash Sharma", "15-12-90", "hanumangarh", "2:10am", "5.8", "Fair", "MCA", "Software developer", "Hanumangarh", 1000, "Lal Chand", "Rameshwari Devi", "two elder brother", "Abohar", "Navwal,chotia", false, "Abohar", "47355","5548868964", "parkashsharma33@gmail.com","rgytrytry","retyrty","reteryrty","3453454"));
		return repositery.save(u);
		
		
		//return repositery.save(new User("101", "self", "unMarried", "Parkash", "154-12-1990", "Hanumangarh", "2:10AM", "5.8", "Fair", "MCA", "Software developer", "sec 38 Gurgoan", 1000000, "Lal Chand", "Rameshwari Devi", "two elder brother", "Abohar", "Nawal,chotia", false, "Abohar", "9464755334", "7823456789", "parkashsharma33@gmail.com", "Nawal", "Choia", "hindi", "7-04-2019"));
		
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repositery.findAll();
	}

	@Override
	public void deleteUser(String userid) {
		// TODO Auto-generated method stub
		 Query qur=new Query();
	       qur.addCriteria(Criteria.where("id").is(userid));
	      
	     User user=   mongoTemplate.findOne(qur, User.class);
	    
		
	     repositery.delete(user);
	       
		//return user;

	}

	@Override
	public List<User> getUserByName(String name) {
		// TODO Auto-generated method stub
		
		 Query qur=new Query();
	       qur.addCriteria(Criteria.where("name").is(name));
	       return mongoTemplate.find(qur, User.class);
	}
	
	
	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		
		 return repositery.findOne(id);
	}

}
