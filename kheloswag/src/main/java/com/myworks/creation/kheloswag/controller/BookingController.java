package com.myworks.creation.kheloswag.controller;

import com.myworks.creation.kheloswag.model.NewBookingList;
import com.myworks.creation.kheloswag.model.NewBookingRequest;
import com.myworks.creation.kheloswag.model.NewBookingResponse;
import com.myworks.creation.kheloswag.service.StateListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController implements BookingApi {

    private StateListService stateListService;

    public BookingController(StateListService stateListService) {
        this.stateListService = stateListService;
    }

    @Override
    public ResponseEntity<NewBookingList> getBookingListForUserId(String userId) {
        return new ResponseEntity<NewBookingList>(stateListService.getBookingListForUserId(userId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<NewBookingResponse> createBooking(NewBookingRequest newBookingRequest) {
        return new ResponseEntity<NewBookingResponse>(stateListService.createBooking(newBookingRequest), HttpStatus.CREATED);
    }
}
