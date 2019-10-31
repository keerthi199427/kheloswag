package com.myworks.creation.kheloswag.dbmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name="grounds_list")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroundEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ground_id")
    private Long groundId;

    @Column(name = "ground_name")
    private String groundName;

    @Column(name = "ground_state")
    private String groundState;

    @Column(name = "ground_district")
    private String groundDistrict;

    @Column(name = "game_id")
    private Long gameId;

    @Column(name = "game_name")
    private String gameName;

    @Column(name = "ground_cre_ts", nullable = false)
    private ZonedDateTime groundCreationTime;

    @Column(name = "ground_updt_ts", nullable = false)
    private ZonedDateTime groundModificationTime;

    @Column(name = "ground_active")
    private boolean groundActive;

    public boolean isGroundActive() {
        return groundActive;
    }

    public void setGroundActive(boolean groundActive) {
        this.groundActive = groundActive;
    }

    public Long getGroundId() {
        return groundId;
    }

    public void setGroundId(Long groundId) {
        this.groundId = groundId;
    }

    public String getGroundName() {
        return groundName;
    }

    public void setGroundName(String groundName) {
        this.groundName = groundName;
    }

    public String getGroundState() {
        return groundState;
    }

    public void setGroundState(String groundState) {
        this.groundState = groundState;
    }

    public String getGroundDistrict() {
        return groundDistrict;
    }

    public void setGroundDistrict(String groundDistrict) {
        this.groundDistrict = groundDistrict;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public ZonedDateTime getGroundCreationTime() {
        return groundCreationTime;
    }

    public void setGroundCreationTime(ZonedDateTime groundCreationTime) {
        this.groundCreationTime = groundCreationTime;
    }

    public ZonedDateTime getGroundModificationTime() {
        return groundModificationTime;
    }

    public void setGroundModificationTime(ZonedDateTime groundModificationTime) {
        this.groundModificationTime = groundModificationTime;
    }
}
