package com.myworks.creation.kheloswag.repo;

import com.myworks.creation.kheloswag.dbmodel.StateListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateListRepository extends JpaRepository<StateListEntity, Long> {
    List<StateListEntity> findStateListEntityByStateIdIsNotNull();
}
