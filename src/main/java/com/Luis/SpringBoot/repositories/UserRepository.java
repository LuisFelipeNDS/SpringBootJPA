package com.Luis.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luis.SpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
//JpaRepository<T, ID> | "T" -> o tipo, ID -> o tipo da minha chave

}
