package com.Luis.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luis.SpringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {	
//JpaRepository<T, ID> | "T" -> o tipo, ID -> o tipo da minha chave

}
