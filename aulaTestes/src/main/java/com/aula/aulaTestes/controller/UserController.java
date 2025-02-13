package com.aula.aulaTestes.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get")
    public String getUser() {
        return "Carregando usuário...";
    }

    @PostMapping("/save")
    public String saveUser() {
        return "Salvando usuário...";
    }

    @PutMapping("/update")
    public String updateUser() {
        return "Atualizando usuário...";
    }

    @DeleteMapping("/delete")
    public String deleteUser() {
        return "Deletando usuário...";
    }
    
}