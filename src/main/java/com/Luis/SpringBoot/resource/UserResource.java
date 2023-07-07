package com.Luis.SpringBoot.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Luis.SpringBoot.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity<User> findAll(){ 
		User u = new User(1L, "Luis", "Luis@gmail.com", "9999", "123");
		//retorna obj do tipo ResponseEntity
		// .ok() retorna a mensagem com sucesso para o http
		// .body() retorna a variavel u
		return ResponseEntity.ok().body(u);
	}

}
