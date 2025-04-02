package com.example.DoctorAppointmentSystem.Controller;

import com.example.DoctorAppointmentSystem.Model.AdminLogin;
import com.example.DoctorAppointmentSystem.Model.Appointment;
import com.example.DoctorAppointmentSystem.Model.UserLogin;
import com.example.DoctorAppointmentSystem.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @GetMapping("/appointments")
    public List<Appointment> getAllAppointment()
    {
        return appointmentService.getAllAppointment();
    }
    @GetMapping("/appointments/view")
    public Appointment getAppointmentbyID(@RequestParam("patientName")String patientName)
    {
        return appointmentService.getAppointmentbyID(patientName);
    }
   
    @PostMapping("/appointments")
    public String saveAppointment(@RequestBody Appointment appointment)
    {
        appointmentService.saveAppointment(appointment);
        return "Your appointment is Successfully booked!";
    }
    @PutMapping("/appointments/{id}")
    public String updateAppointment(@RequestBody Appointment appointment ,@PathVariable("id") int id)
    {
       return  (appointmentService.updateAppointment( appointment, id));
    }
    @DeleteMapping("/appointments/{id}")
    public String deleteAppointment(@PathVariable("id") int id)
    {
        return  (appointmentService.deleteAppointment(id));
    }

}

