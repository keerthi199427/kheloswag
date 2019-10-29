package com.myworks.creation.kheloswag.controller;

import com.myworks.creation.kheloswag.model.NewBookingList;
import com.myworks.creation.kheloswag.service.StateListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class MyBookingListsController implements MyBookingListsApi {

    private StateListService stateListService;

    public MyBookingListsController(StateListService stateListService) {
        this.stateListService = stateListService;
    }

    @Override
    public ResponseEntity<NewBookingList> getBookingListForUserId(String userId) {
        return new ResponseEntity<NewBookingList>(stateListService.getBookingListForUserId(userId), HttpStatus.OK);
    }
}
