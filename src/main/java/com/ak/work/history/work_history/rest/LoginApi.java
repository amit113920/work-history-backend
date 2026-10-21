package com.ak.work.history.work_history.rest;

import com.ak.work.history.work_history.dto.LoginRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginApi {

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody  LoginRequestDto request){

        if(request.getPassword().isBlank() && request.getUserId().isBlank()){
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
