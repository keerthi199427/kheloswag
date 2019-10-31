package com.myworks.creation.kheloswag.dbmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@Table(name= "booking_list")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewBookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private String bookingId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "state_name")
    private String stateName;

    @Column(name = "district_name")
    private String districtName;

    @Column(name = "ground_name")
    private String groundName;

    @Column(name = "game_name")
    private String gameName;

    @Column(name = "booking_date", nullable = false)
    private String gameBookingDate;

    @Column(name = "game_start_ts", nullable = false)
    private String gameStartTime;

    @Column(name = "game_end_ts" , nullable = false)
    private String gameEndTime;

    public String getGameBookingDate() {
        return gameBookingDate;
    }

    public void setGameBookingDate(String gameBookingDate) {
        this.gameBookingDate = gameBookingDate;
    }

    public boolean isBookingActive() {
        return bookingActive;
    }

    public void setBookingActive(boolean bookingActive) {
        this.bookingActive = bookingActive;
    }

    @Column(name="booking_active")
    private boolean bookingActive;



    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getGroundName() {
        return groundName;
    }

    public void setGroundName(String groundName) {
        this.groundName = groundName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameStartTime() {
        return gameStartTime;
    }

    public void setGameStartTime(String gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public String getGameEndTime() {
        return gameEndTime;
    }

    public void setGameEndTime(String gameEndTime) {
        this.gameEndTime = gameEndTime;
    }
}
