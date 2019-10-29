package com.myworks.creation.kheloswag.dbmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

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

    @Column(name = "gameId")
    private String gameId;

    @Column(name = "game_name")
    private String gameName;

    @Column(name = "start_ts", nullable = false)
    private ZonedDateTime gameStartTime;

    @Column(name = "end_ts" , nullable = false)
    private ZonedDateTime gameEndTime;

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

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public ZonedDateTime getGameStartTime() {
        return gameStartTime;
    }

    public void setGameStartTime(ZonedDateTime gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public ZonedDateTime getGameEndTime() {
        return gameEndTime;
    }

    public void setGameEndTime(ZonedDateTime gameEndTime) {
        this.gameEndTime = gameEndTime;
    }
}
