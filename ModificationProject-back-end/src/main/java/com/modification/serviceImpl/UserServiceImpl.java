package com.modification.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modification.entity.User;
import com.modification.repository.UserRepository;
import com.modification.service.UserService;


	@Service
	public class UserServiceImpl  implements UserService {

	    @Autowired
	    private UserRepository userRepository;

	    @Override
	    public List<User> findAll() {
	        return userRepository.findAll();
	    }

	    @Override
	    public Optional<User> findById(int id) {
	        return userRepository.findById(id);
	    }

	    @Override
	    public User save(User user) {
	        return userRepository.save(user);
	    }

	    @Override
	    public void delete(int id) {
	        userRepository.deleteById(id);
	    }

	    @Override
	    public User login(String email, String password) {
	        return userRepository.findByEmailAndPassword(email, password);
	    }
	}


