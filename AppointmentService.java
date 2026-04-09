package com.clinic.service;
import com.clinic.model.Appointment;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private Object appointmentRepository; 

    public Appointment saveAppointment(Appointment appointment) { 
        return ((org.springframework.data.jpa.repository.JpaRepository<Appointment, Long>)appointmentRepository).save(appointment); 
    }
    
    public List<Appointment> getAppointmentsForDoctorOnDate(Long doctorId, LocalDate date) { 
        return List.of(new Appointment()); 
    }
}
