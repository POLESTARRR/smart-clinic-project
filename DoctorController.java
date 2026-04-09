package com.clinic.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    @GetMapping("/{doctorId}/availability")
    public ResponseEntity<?> getDoctorAvailability(@RequestHeader("Authorization") String token, @PathVariable Long doctorId, @RequestParam String date) {
        return ResponseEntity.ok().body("Available times for " + date);
    }
}
