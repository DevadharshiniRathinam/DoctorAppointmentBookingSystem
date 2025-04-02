package com.example.DoctorAppointmentSystem.Controller;

import com.example.DoctorAppointmentSystem.Model.AdminLogin;
import com.example.DoctorAppointmentSystem.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    @Autowired
     private AdminService adminService;
    @PostMapping("/admin/create")
    public String adminCreate(@RequestBody AdminLogin adminLogin)
    {
        adminService.adminCreate(adminLogin);
        return"the admin is successfully created";
    }
    @PostMapping("/admin/login")
    public boolean adminLogin(@RequestParam("adminId") int adminId ,@RequestParam("password") String password)
    {
       return adminService.adminLogin(adminId,password);
    }
}
