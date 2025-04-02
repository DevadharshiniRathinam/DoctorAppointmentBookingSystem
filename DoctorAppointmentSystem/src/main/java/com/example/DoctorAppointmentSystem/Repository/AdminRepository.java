package com.example.DoctorAppointmentSystem.Repository;

import com.example.DoctorAppointmentSystem.Model.AdminLogin;
import com.example.DoctorAppointmentSystem.Model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AdminRepository  extends JpaRepository<AdminLogin,Integer > {
    Optional<AdminLogin>findByAdminIdAndPassword(int adminId,String password);
}
