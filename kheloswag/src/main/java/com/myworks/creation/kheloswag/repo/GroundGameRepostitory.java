package com.myworks.creation.kheloswag.repo;

import com.myworks.creation.kheloswag.dbmodel.GroundEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroundGameRepostitory extends JpaRepository<GroundEntity, Long> {
    List<GroundEntity> findAllByGroundStateAndGroundDistrictAndGameNameAndGroundActiveIsTrue(String stateName, String districtName, String gameName);

}
