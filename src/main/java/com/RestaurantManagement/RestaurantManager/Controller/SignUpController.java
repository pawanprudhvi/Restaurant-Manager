package com.RestaurantManagement.RestaurantManager.Controller;

import com.RestaurantManagement.RestaurantManager.Model.SignUpRequest;
import com.RestaurantManagement.RestaurantManager.Model.UserDto;
import com.RestaurantManagement.RestaurantManager.Model.UserEntity;
import com.RestaurantManagement.RestaurantManager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {
    @Autowired
    private UserService userservice;
    @PostMapping("/Signup")
    public ResponseEntity<String> signup(@RequestBody UserDto user)
    {
        System.out.print(user);
        UserEntity usere= new UserEntity();
        usere.setEmail(user.getEmail());
        usere.setName(user.getName());
        usere.setPasssword(user.getPassword());
        System.out.print(usere);

        String response = userservice.createUser(usere);
        return ResponseEntity.ok(response);
    }

}
