package com.myworks.creation.kheloswag.controller;

import com.myworks.creation.kheloswag.model.Grounds;
import com.myworks.creation.kheloswag.service.StateListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class GroundGameController implements GroundsAndGamesApi {
    private StateListService stateListService;

    public GroundGameController(StateListService stateListService) {
        this.stateListService = stateListService;
    }

    @Override
    public ResponseEntity<Grounds> getGroundsByStateNameAndDistrictNameAndGameName(String groundState, String groundDistrict, String gameName) {
        return new ResponseEntity<Grounds>(stateListService.getGroundsByStateNameAndDistrictNameAndGameName(groundState,groundDistrict,gameName), HttpStatus.OK);
    }
}
