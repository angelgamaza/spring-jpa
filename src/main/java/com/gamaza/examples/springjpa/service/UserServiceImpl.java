package com.gamaza.examples.springjpa.service;

import com.gamaza.examples.springjpa.dao.UserDAO;
import com.gamaza.examples.springjpa.model.User;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAll() {
        return Lists.newArrayList(userDAO.findAll());
    }

}
