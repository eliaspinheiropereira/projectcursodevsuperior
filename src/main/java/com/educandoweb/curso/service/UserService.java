package com.educandoweb.curso.service;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll(){
        return this.userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> userOptional = this.userRepository.findById(id);
        return userOptional.get();
    }
}
