package com.clinic.service;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class DoctorService {
    public List<String> getAvailableTimeSlots(Long doctorId, LocalDate date) { return List.of("09:00 AM"); }
    public Object validateLogin(String email, String password) { return "Login Success"; }
}
