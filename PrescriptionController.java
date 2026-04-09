package com.clinic.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.Map;
import java.util.HashMap;

class PrescriptionDTO {
    private String details;
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {
    @PostMapping("/")
    public ResponseEntity<Map<String, String>> savePrescription(@RequestHeader("Authorization") String token, @Valid @RequestBody PrescriptionDTO prescriptionDto) {
        Map<String, String> response = new HashMap<>();
        response.put("status", "Success");
        response.put("message", "Prescription saved");
        return ResponseEntity.ok(response);
    }
}
