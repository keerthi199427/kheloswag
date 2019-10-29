package com.myworks.creation.kheloswag.controller;

import com.myworks.creation.kheloswag.model.NewBookingRequest;
import com.myworks.creation.kheloswag.model.NewBookingResponse;
import com.myworks.creation.kheloswag.service.StateListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class NewBookingController implements NewBookingApi {
    private StateListService stateListService;

    @Autowired
    public NewBookingController(StateListService stateListService) {
        this.stateListService = stateListService;
    }

    @Override
    public ResponseEntity<NewBookingResponse> createBooking(NewBookingRequest newBookingRequest) {
        return new ResponseEntity<NewBookingResponse>(stateListService.createBooking(newBookingRequest), HttpStatus.CREATED);
    }
}
