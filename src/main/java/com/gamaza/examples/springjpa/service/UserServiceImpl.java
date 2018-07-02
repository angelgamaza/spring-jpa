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

    @Override
    public User getOne(Integer id) {
        return userDAO.findById(id).orElseGet(User::new);
    }

    @Override
    public User create(User user) {
        return userDAO.save(user);
    }

    @Override
    public void update(Integer id, User user) {
        for(User u : getAll())
            if(u.getId() == id) {
                user.setId(id);
                userDAO.save(user);
                break;
            }
    }

    @Override
    public void delete(Integer id) {
        userDAO.deleteById(id);
    }

}
