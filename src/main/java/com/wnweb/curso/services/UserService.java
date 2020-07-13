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
		return obj.get();   //deve fazer o tratamento de exceções (quando o id não existe) etc
 	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);   //deve ser incluída a classe de exceção para delete em usuário que não existe (DataBase Exception)
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getOne(id);  //instancia sem ir ao Banco de Dados. só prepara o objeto. é mais eficiente
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setEmail(obj.getEmail());
		entity.setName(obj.getName());
		entity.setPhone(obj.getPhone());  //deve ser incluída exceção específica - EntityNotFoundException
		
	}
}
