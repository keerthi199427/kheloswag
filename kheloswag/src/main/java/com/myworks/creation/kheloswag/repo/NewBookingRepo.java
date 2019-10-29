package com.myworks.creation.kheloswag.repo;

import com.myworks.creation.kheloswag.dbmodel.NewBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewBookingRepo extends JpaRepository<NewBookingEntity,Long> {
    List<NewBookingEntity> findNewBookingEntityByUserId(String userId);
}
