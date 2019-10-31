package com.myworks.creation.kheloswag.controller;

import com.myworks.creation.kheloswag.model.Grounds;
import com.myworks.creation.kheloswag.service.StateListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class GroundGameController implements GroundsGamesApi {
    private StateListService stateListService;

    public GroundGameController(StateListService stateListService) {
        this.stateListService = stateListService;
    }

    @Override
    public ResponseEntity<Grounds> getGroundsByStateNameAndDistrictName(String groundState, String groundDistrict) {
        return new ResponseEntity<Grounds>(stateListService.getGroundsByStateNameAndDistrictName(groundState,groundDistrict), HttpStatus.OK);
    }
}
