package com.Luis.SpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Luis.SpringBoot.entities.User;
import com.Luis.SpringBoot.repositories.UserRepository;

@Service
//@Component registra a classe como um componente do Spring
//@Service registra um servico na camada de servico
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		
		return obj.get(); //Operacao get() do Optional retorna um objeto do tipo que foi atribuido
	}	
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	
}
