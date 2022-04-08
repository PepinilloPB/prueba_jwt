package com.example.ucb.prueba_jwt.dao;

import com.example.ucb.prueba_jwt.Model.DAOUser;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
    DAOUser findByUsername(String username);
}
