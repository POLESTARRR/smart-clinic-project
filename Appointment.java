package com.clinic.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne @JoinColumn(name = "patient_id")
    private Patient patient;

    @NotNull @Future
    private LocalDateTime appointmentTime;
}
