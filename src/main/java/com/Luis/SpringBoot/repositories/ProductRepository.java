package com.Luis.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luis.SpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {	
//JpaRepository<T, ID> | "T" -> o tipo, ID -> o tipo da minha chave

}
