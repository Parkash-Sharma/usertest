package com.khandelwal.vipra.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.khandelwal.vipra.model.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<User, String>  {

	User findOne(String id);
	/*public List<User> findAll();
	public User findByName(String name);
*/
}
