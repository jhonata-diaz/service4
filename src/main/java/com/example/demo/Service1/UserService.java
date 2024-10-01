package com.example.demo.Service1;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public User createUser(User user) {
        users.add(user);
        return user; // Retornar el usuario creado
    }

    public List<User> getAllUsers() {
        return users; // Método para obtener todos los usuarios
    }
}
