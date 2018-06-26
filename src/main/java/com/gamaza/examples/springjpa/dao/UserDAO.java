package com.gamaza.examples.springjpa.dao;

import com.gamaza.examples.springjpa.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserDAO extends CrudRepository<User, Integer> {}
