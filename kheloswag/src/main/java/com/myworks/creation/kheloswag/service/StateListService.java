package com.myworks.creation.kheloswag.service;

import com.myworks.creation.kheloswag.dbmodel.*;
import com.myworks.creation.kheloswag.exception.DuplicateRecordException;
import com.myworks.creation.kheloswag.exception.NoRecordFoundException;
import com.myworks.creation.kheloswag.model.*;
import com.myworks.creation.kheloswag.repo.*;
import com.myworks.creation.kheloswag.validations.VerifyParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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

        state.setCreationTime(creationTime.toLocalDateTime().atZone(ZoneId.of("IST")).toString());
        state.setModificationTime(modificationTime.toLocalDateTime().atZone(ZoneId.of("IST")).toString());

        return state;
    }

    public Districts getDistrictListsByStateName(String stateName) {
        Districts districts = new Districts();
        List<DistrictListEntity> districtListEntityList = districtListRepository.findByStateName(stateName);
        if(districtListEntityList.isEmpty()) {
            NoRecordFoundException noRecordFoundException = new NoRecordFoundException("No given state name found");
            throw noRecordFoundException;
        }
        if(!CollectionUtils.isEmpty(districtListEntityList)) {
            List<District> districtsList = districtListEntityList.stream().map(StateListService::buildDistrict).collect(Collectors.toList());
            districts.setDistrictsList(districtsList);
        }
        return districts;
    }

    private static District buildDistrict(DistrictListEntity districtListEntity) {
        District district = new District();
        district.setDistrictId(districtListEntity.getDistrictId().intValue());
        district.setDistrictName(districtListEntity.getDistrictName());
        district.setStateName(districtListEntity.getStateName());
        ZonedDateTime creationTime = districtListEntity.getCreationTime();
        ZonedDateTime modificationTime = districtListEntity.getModificationTime();

        district.setCreationTime(creationTime.toLocalDateTime().atZone(ZoneId.of("Asia/Kolkata")).toString());
        district.setModificationTime(modificationTime.toLocalDateTime().atZone(ZoneId.of("Asia/Kolkata")).toString());

        return district;
    }

    public User createUser(UserRequest userRequest) {
        UserEntity userEntity = constructUserEntity(userRequest);
        verfiyParameters(userRequest);
        UserEntity userEntityResult = userRepository.save(userEntity);
        return constructUserResponse(userEntityResult);
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
                    getDateTimeInIST(userRequest.getUserCreationTime()): null);
            userEntity.setUserModificationTime(userRequest.getUserCreationTime() != null?
                    getDateTimeInIST(userRequest.getUserCreationTime()): null);
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
        verifyNewBookingParameters(newBookingRequest);
        NewBookingEntity newBookingEntity = constructNewBookingEntity(newBookingRequest);
        NewBookingEntity newBookingEntityResult = newBookingRepo.save(newBookingEntity);
        return constructNewBookingResponse(newBookingEntityResult);
    }

    private NewBookingEntity constructNewBookingEntity(NewBookingRequest newBookingRequest) {
        NewBookingEntity newBookingEntity = new NewBookingEntity();
        if(newBookingRequest !=null) {
            newBookingEntity.setUserId((newBookingRequest.getUserId()));
            newBookingEntity.setDistrictName(newBookingRequest.getDistrictName());
            newBookingEntity.setGameName(newBookingRequest.getGameName());
            newBookingEntity.setGroundName(newBookingRequest.getGroundName());
            newBookingEntity.setStateName(newBookingRequest.getStateName());
            newBookingEntity.setGameBookingDate(newBookingRequest.getGameBookingDate());
            newBookingEntity.setGameEndTime(newBookingRequest.getGameEndTime());
            newBookingEntity.setGameStartTime(newBookingRequest.getGameStartTime());
            newBookingEntity.setBookingActive(newBookingRequest.isBookingActive());
        }
        return  newBookingEntity;
    }

    private NewBookingResponse constructNewBookingResponse(NewBookingEntity newBookingEntity) {
        NewBookingResponse newBookingResponse= new NewBookingResponse();
        if(newBookingEntity !=null) {
            newBookingResponse.setBookingId(newBookingEntity.getBookingId());
            newBookingResponse.setUserId((newBookingEntity.getUserId()));
            newBookingResponse.setDistrictName(newBookingEntity.getDistrictName());
            newBookingResponse.setGameName(newBookingEntity.getGameName());
            newBookingResponse.setGroundName(newBookingEntity.getGroundName());
            newBookingResponse.setStateName(newBookingEntity.getStateName());
            newBookingResponse.setGameBookingDate(newBookingEntity.getGameBookingDate()!= null? newBookingEntity.getGameBookingDate().toString(): " ");
            newBookingResponse.setGameEndTime(newBookingEntity.getGameEndTime() !=null ? newBookingEntity.getGameEndTime().toString(): " ");
            newBookingResponse.setGameStartTime(newBookingEntity.getGameStartTime() !=null ? newBookingEntity.getGameStartTime().toString(): " ");
            newBookingResponse.setBookingActive(newBookingEntity.isBookingActive());
        }
        return newBookingResponse;
    }

    public ZonedDateTime getDateTimeInIST(String inDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(inDateTime,dateTimeFormatter);
        return localDateTime.atZone(ZoneId.of("Asia/Kolkata"));
    }

    public Date getDateInIST(String inDateTime) {
        Date date = null;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = format.parse(inDateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public ZonedDateTime getTimeInIST(String inDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(inDateTime,dateTimeFormatter);
        return localDateTime.atZone(ZoneId.of("Asia/Kolkata"));
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
        newBookingResponse.setGameName(newBookingEntity.getGameName());
        newBookingResponse.setGroundName(newBookingEntity.getGroundName());
        newBookingResponse.setStateName(newBookingEntity.getStateName());
        newBookingResponse.setUserId(newBookingEntity.getUserId());
        newBookingResponse.setGameBookingDate(newBookingEntity.getGameBookingDate());
        newBookingResponse.setBookingActive(newBookingEntity.isBookingActive());

        newBookingResponse.setGameStartTime(newBookingEntity.getGameStartTime());
        newBookingResponse.setGameEndTime(newBookingEntity.getGameEndTime());

        return newBookingResponse;
    }

    public Grounds getGroundsByStateNameAndDistrictNameAndGameName(String groundState, String groundDistrict, String gameName) {
        Grounds grounds = new Grounds();
        List<GroundEntity> groundEntityList = groundGameRepostitory.findAllByGroundStateAndGroundDistrictAndGameNameAndGroundActiveIsTrue(groundState,groundDistrict,gameName);
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

        ground.setGroundCreationTime(creationTime.toLocalDateTime().atZone(ZoneId.of("Asia/Kolkata")).toString());
        ground.setGroundModificationTime(modificationTime.toLocalDateTime().atZone(ZoneId.of("Asia/Kolkata")).toString());
        return ground;
    }

    private void verifyNewBookingParameters(NewBookingRequest newBookingRequest) {
        Optional<NewBookingEntity> newBookingEntityOptional = newBookingRepo.findNewBookingEntityByStateNameAndDistrictNameAndAndGroundNameAndGameNameAndGameStartTimeAndGameBookingDateAndBookingActive(
                newBookingRequest.getStateName(),newBookingRequest.getDistrictName(),newBookingRequest.getGroundName(),newBookingRequest.getGameName(),newBookingRequest.getGameStartTime(),newBookingRequest.getGameBookingDate(),newBookingRequest.isBookingActive());
        if(newBookingEntityOptional.isPresent()) {
            DuplicateRecordException duplicateRecordException = new DuplicateRecordException("Requested Slot is already booked");
            throw duplicateRecordException;
        }
    }

    private void verfiyParameters(UserRequest userRequest) {

        Optional<UserEntity> userEntityOptional = userRepository.findAllByUserMobile(userRequest.getUserMobile());
        if(userEntityOptional.isPresent()) {
            DuplicateRecordException duplicateRecordException = new DuplicateRecordException("User mobile already exists");
            throw duplicateRecordException;
        }
    }
}
