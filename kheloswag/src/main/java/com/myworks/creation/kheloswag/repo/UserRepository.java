package com.myworks.creation.kheloswag.repo;

import com.myworks.creation.kheloswag.dbmodel.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findAllByUserMobile(String userMobile);
}
