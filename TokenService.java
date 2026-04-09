package com.clinic.service;
import org.springframework.stereotype.Service;

@Service
public class TokenService {
    public String generateToken(String email) { return "jwt.token.here"; }
    public String getSigningKey() { return "mySecretKey"; }
}
