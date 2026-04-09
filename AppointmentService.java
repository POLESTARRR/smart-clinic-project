package com.clinic.service;
import com.clinic.model.Appointment;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {
    public Appointment saveAppointment(Appointment appointment) { return appointment; }
    public List<Appointment> getAppointmentsForDoctorOnDate(Long doctorId, LocalDate date) { return null; }
}
