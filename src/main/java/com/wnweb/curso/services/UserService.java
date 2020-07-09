package com.wnweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wnweb.curso.entities.User;
import com.wnweb.curso.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findbyId(Long id){
		Optional<User> obj = repository.findById(id);
		return obj.get(); 
 	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	
	
}
