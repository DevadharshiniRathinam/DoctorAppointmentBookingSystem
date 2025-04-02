package com.example.DoctorAppointmentSystem.Repository;

import com.example.DoctorAppointmentSystem.Model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Time;
import java.util.Optional;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer > {
    Optional<Appointment>findBypatientName(String patientName);
    Optional<Appointment> findByDoctorNameAndAppointmentDateAndAppointmentTime(String doctorName, Date appointmentDate, Time appointmentTime);

}
