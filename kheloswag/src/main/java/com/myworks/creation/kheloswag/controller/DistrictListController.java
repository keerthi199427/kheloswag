package com.myworks.creation.kheloswag.controller;

import com.myworks.creation.kheloswag.model.Districts;
import com.myworks.creation.kheloswag.service.StateListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class DistrictListController implements DistrictListApi {
    private final StateListService stateListService;

    @Autowired
    public DistrictListController(StateListService stateListService) {
        this.stateListService = stateListService;
    }

    @Override
    public ResponseEntity<Districts> getDistrictLists(Long stateId) {
        return new ResponseEntity<Districts>(stateListService.getDistrictList(stateId), HttpStatus.OK);
    }
}
