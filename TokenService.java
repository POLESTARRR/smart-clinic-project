package com.clinic.service;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

@Service
public class TokenService {
    private final String secretKey = "mySecretKey"; 

    public String generateToken(String email) { 
        long nowMillis = System.currentTimeMillis();
        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date(nowMillis))
                .setExpiration(new Date(nowMillis + 3600000))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }
    
    public String getSigningKey() { 
        return secretKey; 
    }
}
