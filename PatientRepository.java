package com.clinic.repository;
import com.clinic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for Patient entity.
 */
public interface PatientRepository extends JpaRepository<Patient, Long> {
    
    /**
     * Retrieves a patient by their email address.
     */
    Patient findByEmail(String email);
    
    /**
     * Retrieves a patient using either their email address or phone number.
     */
    Patient findByEmailOrPhoneNumber(String email, String phoneNumber);
}
