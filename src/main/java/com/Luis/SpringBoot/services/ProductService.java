package com.Luis.SpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Luis.SpringBoot.entities.Product;
import com.Luis.SpringBoot.repositories.ProductRepository;

@Service
//@Component registra a classe como um componente do Spring
//@Service registra um servico na camada de servico
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id){
		Optional<Product> obj = repository.findById(id);
		
		return obj.get(); //Operacao get() do Optional retorna um objeto do tipo que foi atribuido
	}				
	
	
}
