package com.clinic.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {
    @PostMapping("/")
    public ResponseEntity<?> savePrescription(@RequestHeader("Authorization") String token, @Valid @RequestBody String prescriptionDto) {
        return ResponseEntity.ok().body("Success");
    }
}
