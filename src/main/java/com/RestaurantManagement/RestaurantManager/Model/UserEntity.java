package com.RestaurantManagement.RestaurantManager.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long UserId;

    private String name;

    private String email;

    private String passsword;

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public UserEntity(long userId, String name, String email, String passsword) {
        UserId = userId;
        this.name = name;
        this.email = email;
        this.passsword = passsword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }
    public UserEntity()
    {

    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "UserId=" + UserId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", passsword='" + passsword + '\'' +
                '}';
    }
}
