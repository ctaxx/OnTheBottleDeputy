package com.bottle.user.controller;

import com.bottle.user.dto.request.RequestDTO;
import com.bottle.user.dto.response.ResponseDTO;
import com.bottle.user.model.DAO.UserDAOImpl;
import com.bottle.user.model.entity.UsersEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @ResponseBody
    @GetMapping(path = "/showUsers")
    public ResponseDTO showUsers(RequestDTO request) {
        UserDAOImpl userDAO = new UserDAOImpl();
        UsersEntity user = null;

//        user = (UsersEntity)userDAO.getEntityByID(request.getId());
        user = (UsersEntity) userDAO.getEntityByID(3);
        System.out.println("A name of the user is " + user.getName());

        return new ResponseDTO(user);
    }

}
