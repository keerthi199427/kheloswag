package com.myworks.creation.kheloswag.service;

import com.myworks.creation.kheloswag.dbmodel.*;
import com.myworks.creation.kheloswag.exception.DuplicateRecordException;
import com.myworks.creation.kheloswag.model.*;
import com.myworks.creation.kheloswag.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StateListService {
    private final StateListRepository stateListRepository;
    private final DistrictListRepository districtListRepository;
    private final UserRepository userRepository;
    private final NewBookingRepo newBookingRepo;
    private final GroundGameRepostitory groundGameRepostitory;

    @Autowired
    public StateListService(StateListRepository stateListRepository, DistrictListRepository districtListRepository, UserRepository userRepository, NewBookingRepo newBookingRepo, GroundGameRepostitory groundGameRepostitory) {
        this.stateListRepository = stateListRepository;
        this.districtListRepository = districtListRepository;
        this.userRepository = userRepository;
        this.newBookingRepo = newBookingRepo;
        this.groundGameRepostitory = groundGameRepostitory;
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

    public Districts getDistrictList(Long stateId) {
        Districts districts = new Districts();
        List<DistrictListEntity> districtListEntityList = districtListRepository.findByStateId(stateId);
        if(!CollectionUtils.isEmpty(districtListEntityList)) {
            List<District> districtsList = districtListEntityList.stream().map(StateListService::buildDistrict).collect(Collectors.toList());
            districts.setDistrictsList(districtsList);
        }
        return districts;
    }

    private static District buildDistrict(DistrictListEntity districtListEntity) {
        District district = new District();
        district.setDistrictId(districtListEntity.getDistrictId().intValue());
        district.setStateId(districtListEntity.getStateId().intValue());
        district.setDistrictName(districtListEntity.getDistrictName());

        ZonedDateTime creationTime = districtListEntity.getCreationTime();
        ZonedDateTime modificationTime = districtListEntity.getModificationTime();

        district.setCreationTime(creationTime.toLocalDateTime().atZone(ZoneId.of("UTC")).toString());
        district.setModificationTime(modificationTime.toLocalDateTime().atZone(ZoneId.of("UTC")).toString());

        return district;
    }

    public User createUser(UserRequest userRequest) {
        UserEntity userEntity = constructUserEntity(userRequest);
        verfiyParameters(userRequest);
        UserEntity userEntityResult = userRepository.save(userEntity);
        return constructUserResponse(userEntityResult);
    }

    private void verfiyParameters(UserRequest userRequest) {

        Optional<UserEntity> userEntityOptional = userRepository.findAllByUserMobile(userRequest.getUserMobile());
        if(userEntityOptional.isPresent()) {
            DuplicateRecordException duplicateRecordException = new DuplicateRecordException("User mobile already exists");
            throw duplicateRecordException;
        }
    }

    public UserEntity constructUserEntity(UserRequest userRequest) {
        UserEntity userEntity = new UserEntity();
        if(userRequest !=null) {
            userEntity.setUserName(userRequest.getUserName());
            userEntity.setUserAge(userRequest.getUserAge());
            userEntity.setUserEmail(userRequest.getUserEmail());
            userEntity.setUserMobile(userRequest.getUserMobile());
            userEntity.setUserGender(userRequest.getUserGender());
            userEntity.setUserState(userRequest.getUserState());
            userEntity.setUserCreationTime(userRequest.getUserCreationTime() != null?
                    getDateTimeInUTC(userRequest.getUserCreationTime()): null);
            userEntity.setUserModificationTime(userRequest.getUserCreationTime() != null?
                    getDateTimeInUTC(userRequest.getUserCreationTime()): null);
        }
        return userEntity;
    }

    public User constructUserResponse(UserEntity userEntityResult) {
        User user = new User();
        if(userEntityResult !=null) {
            user.setUserId(Long.toString(userEntityResult.getUserId()));
            user.setUserAge(userEntityResult.getUserAge());
            user.setUserEmail(userEntityResult.getUserEmail());
            user.setUserGender(userEntityResult.getUserGender());
            user.setUserMobile(userEntityResult.getUserMobile());
            user.setUserState(userEntityResult.getUserState());
            user.setUserName(userEntityResult.getUserName());
            user.setUserCreationTime(userEntityResult.getUserCreationTime() !=null ? userEntityResult.getUserCreationTime().toString(): " ");
            user.setUserModificationTime(userEntityResult.getUserModificationTime() !=null ? userEntityResult.getUserModificationTime().toString(): " ");
        }
        return user;
    }

    public NewBookingResponse createBooking(NewBookingRequest newBookingRequest) {
        NewBookingEntity newBookingEntity = constructNewBookingEntity(newBookingRequest);
        NewBookingEntity newBookingEntityResult = newBookingRepo.save(newBookingEntity);
        return constructNewBookingResponse(newBookingEntityResult);
    }

    private NewBookingEntity constructNewBookingEntity(NewBookingRequest newBookingRequest) {
        NewBookingEntity newBookingEntity = new NewBookingEntity();
        if(newBookingRequest !=null) {
            newBookingEntity.setUserId((newBookingRequest.getUserId()));
            newBookingEntity.setDistrictName(newBookingRequest.getDistrictName());
            newBookingEntity.setGameId(newBookingRequest.getGameId());
            newBookingEntity.setGameName(newBookingRequest.getGameName());
            newBookingEntity.setGroundName(newBookingRequest.getGroundName());
            newBookingEntity.setStateName(newBookingRequest.getStateName());
            newBookingEntity.setGameEndTime(newBookingRequest.getGameEndTime() != null?
                    getDateTimeInUTC(newBookingRequest.getGameEndTime()): null);
            newBookingEntity.setGameStartTime(newBookingRequest.getGameStartTime() != null?
                    getDateTimeInUTC(newBookingRequest.getGameStartTime()): null);
        }
        return  newBookingEntity;
    }

    private NewBookingResponse constructNewBookingResponse(NewBookingEntity newBookingEntity) {
        NewBookingResponse newBookingResponse= new NewBookingResponse();
        if(newBookingEntity !=null) {
            newBookingResponse.setBookingId(newBookingEntity.getBookingId());
            newBookingResponse.setUserId((newBookingEntity.getUserId()));
            newBookingResponse.setDistrictName(newBookingEntity.getDistrictName());
            newBookingResponse.setGameId(newBookingEntity.getGameId());
            newBookingResponse.setGameName(newBookingEntity.getGameName());
            newBookingResponse.setGroundName(newBookingEntity.getGroundName());
            newBookingResponse.setStateName(newBookingEntity.getStateName());
            newBookingResponse.setGameEndTime(newBookingEntity.getGameEndTime() !=null ? newBookingEntity.getGameEndTime().toString(): " ");
            newBookingResponse.setGameStartTime(newBookingEntity.getGameStartTime() !=null ? newBookingEntity.getGameStartTime().toString(): " ");
        }
        return newBookingResponse;
    }

    public ZonedDateTime getDateTimeInUTC(String inDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(inDateTime,dateTimeFormatter);
        return localDateTime.atZone(ZoneId.of("UTC"));
    }

    public NewBookingList getBookingListForUserId(String userId) {
        NewBookingList newBookingList = new NewBookingList();
        List<NewBookingEntity> newBookingEntityList = newBookingRepo.findNewBookingEntityByUserId(userId);
        if(!CollectionUtils.isEmpty(newBookingEntityList)) {
            List<NewBookingResponse> newBookingResponseList = newBookingEntityList.stream().map(StateListService::buildBookingList).collect(Collectors.toList());
            newBookingList.setBookingsList(newBookingResponseList);
        }
        return newBookingList;
    }

    private static NewBookingResponse buildBookingList(NewBookingEntity newBookingEntity) {
        NewBookingResponse newBookingResponse = new NewBookingResponse();
        newBookingResponse.setBookingId(newBookingEntity.getBookingId());
        newBookingResponse.setDistrictName(newBookingEntity.getDistrictName());
        newBookingResponse.setGameId(newBookingEntity.getGameId());
        newBookingResponse.setGameName(newBookingEntity.getGameName());
        newBookingResponse.setGroundName(newBookingEntity.getGroundName());
        newBookingResponse.setStateName(newBookingEntity.getStateName());
        newBookingResponse.setUserId(newBookingEntity.getUserId());

        ZonedDateTime startTime = newBookingEntity.getGameStartTime();
        ZonedDateTime endTime = newBookingEntity.getGameEndTime();

        newBookingResponse.setGameStartTime(startTime.toLocalDateTime().atZone(ZoneId.of("UTC")).toString());
        newBookingResponse.setGameEndTime(endTime.toLocalDateTime().atZone(ZoneId.of("UTC")).toString());

        return newBookingResponse;
    }

    public Grounds getGroundsByStateNameAndDistrictName(String groundState, String groundDistrict) {
        Grounds grounds = new Grounds();
        List<GroundEntity> groundEntityList = groundGameRepostitory.findAllByGroundStateAndGroundDistrict(groundState,groundDistrict);
        if(!CollectionUtils.isEmpty(groundEntityList)) {
            List<Ground> groundsList = groundEntityList.stream().map(StateListService::buildGround).collect(Collectors.toList());
            grounds.setGroundsList(groundsList);
        }
        return grounds;
    }

    private static Ground buildGround(GroundEntity groundEntity) {
        Ground ground = new Ground();
        ground.setGameId(groundEntity.getGameId().intValue());
        ground.setGameName(groundEntity.getGameName());
        ground.setGroundDistrict(groundEntity.getGroundDistrict());
        ground.setGroundId(groundEntity.getGroundId().intValue());
        ground.setGroundName(groundEntity.getGroundName());
        ground.setGroundState(groundEntity.getGroundState());
        ground.setGroundActive(groundEntity.isGroundActive());

        ZonedDateTime creationTime = groundEntity.getGroundCreationTime();
        ZonedDateTime modificationTime = groundEntity.getGroundModificationTime();

        ground.setGroundCreationTime(creationTime.toLocalDateTime().atZone(ZoneId.of("UTC")).toString());
        ground.setGroundModificationTime(modificationTime.toLocalDateTime().atZone(ZoneId.of("UTC")).toString());
        return ground;
    }
}
