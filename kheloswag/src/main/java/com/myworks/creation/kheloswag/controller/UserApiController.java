package com.myworks.creation.kheloswag.controller;

import com.myworks.creation.kheloswag.model.User;
import com.myworks.creation.kheloswag.model.UserRequest;
import com.myworks.creation.kheloswag.service.StateListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UserApiController implements UsersApi {
    private StateListService stateListService;

    @Autowired
    public UserApiController(StateListService stateListService) {
        this.stateListService = stateListService;
    }

    @Override
    public ResponseEntity<User> createUser(UserRequest userRequest) {
        return new ResponseEntity<User>(stateListService.createUser(userRequest), HttpStatus.CREATED);
    }
}
