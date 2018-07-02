package com.gamaza.examples.springjpa.dao;

import com.gamaza.examples.springjpa.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {}
