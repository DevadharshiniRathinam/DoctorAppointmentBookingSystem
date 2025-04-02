package com.example.DoctorAppointmentSystem.Repository;

import com.example.DoctorAppointmentSystem.Model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<UserLogin,String> {
    Optional<UserLogin> findByUserName(String userName);
    Optional<UserLogin> findByUserNameAndPassword(String userName,String password);

}
