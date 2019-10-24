package com.myworks.creation.kheloswag.controller;

import com.myworks.creation.kheloswag.model.States;
import com.myworks.creation.kheloswag.service.StateListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class StateListController implements StateListApi {
    private final StateListService stateListService;

    @Autowired
    public StateListController(StateListService stateListService) {
        this.stateListService = stateListService;
    }

    @Override
    public ResponseEntity<States> getStatesList() {
        return new ResponseEntity<States>(stateListService.getStateList(), HttpStatus.OK);
    }
}
