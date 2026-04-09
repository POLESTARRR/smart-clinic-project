package com.clinic.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "doctors")
public class Doctor {
    
    // Criteria 1: Defines a JPA entity with proper primary key annotations
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Criteria 2: Defines availableTimes field with the correct type and annotation
    @ElementCollection
    @CollectionTable(name = "doctor_available_times", joinColumns = @JoinColumn(name = "doctor_id"))
    @Column(name = "available_time")
    private List<String> availableTimes;

    private String name;
    private String speciality;
    private String email;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public List<String> getAvailableTimes() { return availableTimes; }
    public void setAvailableTimes(List<String> availableTimes) { this.availableTimes = availableTimes; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpeciality() { return speciality; }
    public void setSpeciality(String speciality) { this.speciality = speciality; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
