package com.Luis.SpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.Luis.SpringBoot.entities.User;
import com.Luis.SpringBoot.repositories.UserRepository;
import com.Luis.SpringBoot.services.excepitions.DatabaseException;
import com.Luis.SpringBoot.services.excepitions.ResourceNotFoundException;

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
		//return obj.get(); //Operacao get() do Optional retorna um objeto do tipo que foi atribuido
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		// Ira tentar pega a requisição get se não conseguir ele lança uma execao
	}	
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id); 
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id); //Objeto monitorado pelo JPA
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
	
	
}
