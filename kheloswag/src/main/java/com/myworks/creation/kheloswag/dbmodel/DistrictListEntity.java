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
@Table(name="district_list")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistrictListEntity {

    @Id
    @Column(name = "district_id")
    private Long districtId;

    @Column(name = "state_name")
    private String stateName;

    @Column(name = "district_name")
    private String districtName;

    @Column(name = "cre_ts", nullable = false)
    private ZonedDateTime creationTime;

    @Column(name = "updt_ts" , nullable = false)
    private ZonedDateTime modificationTime;

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateId) {
        this.stateName = stateId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
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
}
