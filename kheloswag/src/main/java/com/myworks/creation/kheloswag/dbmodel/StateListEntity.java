package com.myworks.creation.kheloswag.dbmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;


@Entity
@Table(name="state_list")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateListEntity {

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public ZonedDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(ZonedDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public ZonedDateTime getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(ZonedDateTime modificationTime) {
        this.modificationTime = modificationTime;
    }

    @Id
    @Column(name = "state_id")
    private Long stateId;

    @Column(name = "state_name")
    private String stateName;

    @Column(name = "cre_ts", nullable = false)
    private ZonedDateTime creationTime;

    @Column(name = "updt_ts" , nullable = false)
    private ZonedDateTime modificationTime;
}
