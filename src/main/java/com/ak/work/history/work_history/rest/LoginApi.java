package com.ak.work.history.work_history.rest;

import com.ak.work.history.work_history.dto.LoginRequestDto;
import com.ak.work.history.work_history.service.jwt.JwtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginApi {
    private static final Logger logger = LoggerFactory.getLogger(LoginApi.class);
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private  JwtService jwtService;

    @PostMapping("/login")
    @CrossOrigin(origins = "*")
    public ResponseEntity<?> login(@RequestBody LoginRequestDto request) {
        try {
            // Authenticate against the LDAP server configured in SecurityConfig
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUserId(), request.getPassword())
            );
            logger.info("Logger : request "+request.getUserId()+" "+request.getPassword());
            if (authentication.isAuthenticated()) {
                logger.info("Logger : authentication "+authentication.isAuthenticated());

                String token = jwtService.generateTokenByUserName(request.getUserId());
                return ResponseEntity.ok("{token:"+token+"}");
            } else {
                return ResponseEntity.status(401).body("Invalid credentials");
            }
        } catch (AuthenticationException e) {
            // Bad credentials or user not found in LDAP directory
            logger.info("Logger : exception "+e.getLocalizedMessage());
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

    }
}