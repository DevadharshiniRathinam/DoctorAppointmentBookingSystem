package com.example.DoctorAppointmentSystem.Controller;

import com.example.DoctorAppointmentSystem.Model.UserLogin;
import com.example.DoctorAppointmentSystem.Service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UserController {
    @Autowired
     private Userservice userservice;
    @PostMapping("/usercreate")
    public String userCreate(@RequestBody UserLogin userLogin)
    {
        return userservice.usercreate(userLogin);
    }
    @GetMapping("/user/login")
    public boolean userLogin(@RequestParam("userName") String userName,@RequestParam("password") String password)
    {
        return userservice.userLogin(userName,password);
    }
}
