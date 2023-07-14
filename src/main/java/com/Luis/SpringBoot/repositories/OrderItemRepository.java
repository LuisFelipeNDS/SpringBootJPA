package com.Luis.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luis.SpringBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {	
//JpaRepository<T, ID> | "T" -> o tipo, ID -> o tipo da minha chave

}
