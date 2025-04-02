package com.example.DoctorAppointmentSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class UserLogin {
    @Id
    String userName;
    String password;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
public UserLogin(){}

}
