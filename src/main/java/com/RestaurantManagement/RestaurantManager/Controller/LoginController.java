package com.RestaurantManagement.RestaurantManager.Controller;

import com.RestaurantManagement.RestaurantManager.Model.LoginRequest;
import com.RestaurantManagement.RestaurantManager.Model.UserEntity;
import com.RestaurantManagement.RestaurantManager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:3000")
public class LoginController {

    @Autowired
    UserService userservice;


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginrequest)
    {
        String username = loginrequest.getUsername();
        UserEntity user = userservice.authenticateUser(username);
        if(user!=null) {
            return ResponseEntity.ok("Yes");
        }
            return ResponseEntity.ofNullable("Not a valid user");
    }

}
