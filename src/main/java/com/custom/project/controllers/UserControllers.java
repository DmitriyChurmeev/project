package com.custom.project.controllers;

import com.custom.project.model.entities.User;
import com.custom.project.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("users")
public class UserControllers {

    private final UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }


}
