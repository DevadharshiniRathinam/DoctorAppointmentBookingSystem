package com.example.DoctorAppointmentSystem.Service;

import com.example.DoctorAppointmentSystem.Model.AdminLogin;
import com.example.DoctorAppointmentSystem.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public  void adminCreate(AdminLogin adminLogin) {
        adminRepository.save(adminLogin);
    }

    public boolean adminLogin(int adminId, String password) {
        boolean value=adminRepository.findByAdminIdAndPassword(adminId,password).isPresent();
        return value;
    }
}
