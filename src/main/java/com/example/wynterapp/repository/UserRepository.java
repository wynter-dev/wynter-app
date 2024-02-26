package com.example.wynterapp.repository;

import com.example.wynterapp.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User getByUserId(String id);
}
