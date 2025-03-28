package com.RestaurantManagement.RestaurantManager.Repository;

import com.RestaurantManagement.RestaurantManager.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Long> {
     Optional<UserEntity> findByEmail(String email);
     Optional<UserEntity> findByName(String name);

}
