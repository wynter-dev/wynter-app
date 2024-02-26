package com.example.wynterapp.service;

import com.example.wynterapp.entity.User;
import com.example.wynterapp.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User create (User user){
        return userRepository.save(user);
    }

    public User findUser(String userId){
        return userRepository.getByUserId(userId);
    }



}
