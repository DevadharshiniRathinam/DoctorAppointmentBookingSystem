package com.example.DoctorAppointmentSystem.Service;

import com.example.DoctorAppointmentSystem.Model.UserLogin;
import com.example.DoctorAppointmentSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class Userservice {
    @Autowired
     private UserRepository userRepository;
    public  String usercreate(UserLogin userLogin) {
        System.out.println("sevicce");
        Optional<UserLogin> existingUser=userRepository.findByUserName(userLogin.getUserName());
        if(existingUser.isPresent())
        {

            return "The user name is not available";
        }
        else
        {
            userRepository.save(userLogin);
            return"The user is successfully created";
        }
    }
    public boolean userLogin(String userName, String password) {
        return userRepository.findByUserNameAndPassword(userName, password).isPresent();

    }
}
