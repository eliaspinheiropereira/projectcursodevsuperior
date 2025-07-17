package com.educandoweb.curso.controller;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final Logger logger = Logger.getLogger(UserController.class.getName());

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        logger.info("GET -> /users");
        List<User> users = this.userService.findAll();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> findById(
            @PathVariable Long id
    ){
        logger.info("GET -> /users/"+id);
        User user = this.userService.findById(id);
        return ResponseEntity.ok().body(user);
    }

}
