package com.Luis.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luis.SpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {	
//JpaRepository<T, ID> | "T" -> o tipo, ID -> o tipo da minha chave

}
