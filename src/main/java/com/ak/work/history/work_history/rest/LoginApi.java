package com.ak.work.history.work_history.rest;
import com.ak.work.history.work_history.dto.LoginRequestDto;
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

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Void> login(@RequestBody LoginRequestDto request) {
        try {
            // Authenticate against the LDAP server configured in SecurityConfig
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUserId(), request.getPassword())
            );

            if (authentication.isAuthenticated()) {
                return new ResponseEntity<>(HttpStatus.OK);
            }
        } catch (AuthenticationException e) {
            // Bad credentials or user not found in LDAP directory
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}