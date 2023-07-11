package com.Luis.SpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Luis.SpringBoot.entities.Order;
import com.Luis.SpringBoot.repositories.OrderRepository;

@Service
//@Component registra a classe como um componente do Spring
//@Service registra um servico na camada de servico
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){ 
		return repository.findAll();
	}
	
	public Order findById(Long id){
		Optional<Order> obj = repository.findById(id);
		
		return obj.get(); //Operacao get() do Optional retorna um objeto do tipo que foi atribuido
	}				
	
	
}
