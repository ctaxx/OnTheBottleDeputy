package com.bottle.user.controller;

import com.bottle.user.dto.request.RequestDTO;
import com.bottle.user.dto.response.ResponseDTO;
import com.bottle.user.model.entity.UsersEntity;
import com.bottle.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class TestController {
    @Autowired
    private UserRepository userRepository;

    public TestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ResponseBody
    @GetMapping(path = "/showUsers")
    public ResponseDTO showUsers(RequestDTO request) {
//        UsersEntity user;
//        user = userRepository.getOne(3);
        UsersEntity user = userRepository.findOne(3);
        System.out.println("TestController: A name of the user is " + user.getName());
        return new ResponseDTO(user);

//        ResponseDTO response = new ResponseDTO();
//        response.setUser(userRepository.getOne(request.getId()));
//        response.setUser(userRepository.findOne(3));
//        return response;

    }
}
