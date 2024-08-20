package com.modification.service;



import java.util.List;
import java.util.Optional;

import com.modification.entity.User;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(int id);
    User save(User user);
    void delete(int id);
	User login(String email, String password);
}

