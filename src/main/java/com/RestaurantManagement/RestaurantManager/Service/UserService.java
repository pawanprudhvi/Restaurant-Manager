package com.RestaurantManagement.RestaurantManager.Service;

import com.RestaurantManagement.RestaurantManager.Model.SignUpRequest;
import com.RestaurantManagement.RestaurantManager.Model.UserEntity;
import com.RestaurantManagement.RestaurantManager.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo jparepo;

    public UserEntity authenticateUser(String username)
    {
        Optional<UserEntity> user = jparepo.findByName(username);
        UserEntity checkuser = user.orElse(null);
        return checkuser;

    }
    public String createUser(UserEntity user)
    {
        if(user!=null) {
            UserEntity userentity = jparepo.save(user);
            return  "SignUp Successful";
        }
        return "Login Failed";


    }
}
