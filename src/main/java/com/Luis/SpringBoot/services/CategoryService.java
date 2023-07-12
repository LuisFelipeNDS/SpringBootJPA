package com.Luis.SpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Luis.SpringBoot.entities.Category;
import com.Luis.SpringBoot.repositories.CategoryRepository;

@Service
//@Component registra a classe como um componente do Spring
//@Service registra um servico na camada de servico
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id){
		Optional<Category> obj = repository.findById(id);
		
		return obj.get(); //Operacao get() do Optional retorna um objeto do tipo que foi atribuido
	}				
	
	
}
