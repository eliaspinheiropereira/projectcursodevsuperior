package com.educandoweb.curso.controller;

import com.educandoweb.curso.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"maria", "maria@gmail.com", "12345", "980544194");
        return ResponseEntity.ok().body(u);
    }

}
