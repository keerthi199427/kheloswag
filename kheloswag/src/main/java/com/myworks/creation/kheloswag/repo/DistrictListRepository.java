package com.myworks.creation.kheloswag.repo;

import com.myworks.creation.kheloswag.dbmodel.DistrictListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictListRepository extends JpaRepository<DistrictListEntity, Long> {
    List<DistrictListEntity> findByStateName(String stateName);
}
