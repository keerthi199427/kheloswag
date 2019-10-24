package com.myworks.creation.kheloswag.service;

import com.myworks.creation.kheloswag.dbmodel.StateListEntity;
import com.myworks.creation.kheloswag.model.State;
import com.myworks.creation.kheloswag.model.States;
import com.myworks.creation.kheloswag.repo.StateListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StateListService {
    private final StateListRepository stateListRepository;

    @Autowired
    public StateListService(StateListRepository stateListRepository) {
        this.stateListRepository = stateListRepository;
    }

    public States getStateList() {
        States states = new States();
        List<StateListEntity> stateListEntityList = stateListRepository.findStateListEntityByStateIdIsNotNull();
        if(!CollectionUtils.isEmpty(stateListEntityList)) {
            List<State> statesList = stateListEntityList.stream().map(StateListService::buildState).collect(Collectors.toList());
            states.setStatesList(statesList);
        }
        return states;
    }

    private static State buildState(StateListEntity stateListEntity) {
        State state = new State();
        state.setStateId(stateListEntity.getStateId().intValue());
        state.setStateName(stateListEntity.getStateName());

        ZonedDateTime creationTime = stateListEntity.getCreationTime();
        ZonedDateTime modificationTime = stateListEntity.getModificationTime();

        state.setCreationTime(creationTime.toLocalDateTime().atZone(ZoneId.of("UTC")).toString());
        state.setModificationTime(modificationTime.toLocalDateTime().atZone(ZoneId.of("UTC")).toString());

        return state;
    }
}
