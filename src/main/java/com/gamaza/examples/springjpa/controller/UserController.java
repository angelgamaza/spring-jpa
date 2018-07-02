package com.gamaza.examples.springjpa.controller;

import com.gamaza.examples.springjpa.model.User;
import com.gamaza.examples.springjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<User> getAll(){
        return userService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody User getOne(@PathVariable("id") Integer id){
        return userService.getOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody User insert(@RequestBody User user){
        return userService.create(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Integer id, @RequestBody User user){
        userService.update(id, user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id){
        userService.delete(id);
    }

}
