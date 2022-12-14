package com.example.serverforincomeoutcomeapp.controllers;

import com.example.serverforincomeoutcomeapp.repos.UserRepo;
import com.example.serverforincomeoutcomeapp.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepo userRepo;

    private final UserService userService;

    public UserController(UserRepo userRepo, UserService userService) {
        this.userRepo = userRepo;
        this.userService = userService;
    }

    @PostMapping("/register")
    public boolean register(@RequestParam String login,
                            @RequestParam String password,
                            @RequestParam String name,
                            @RequestParam String lastName){
        return userService.register(login, password, name, lastName);
    }

    @PostMapping("/login")
    public  String login (@RequestParam String login,
                          @RequestParam String password){
        return userService.login(login, password);
    }

    @GetMapping("/get")
    public String getUser(){
        return userRepo.findAll().toString();
    }
}
