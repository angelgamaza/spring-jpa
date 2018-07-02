package com.gamaza.examples.springjpa.service;

import com.gamaza.examples.springjpa.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getOne(Integer id);
    User create(User user);
    void update(Integer id, User user);
    void delete(Integer id);

}
