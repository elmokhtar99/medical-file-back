package com.medicalfile.app.controller;

import com.medicalfile.app.dto.AuthenticationRequest;
import com.medicalfile.app.dto.AuthenticationResponse;
import com.medicalfile.app.dto.RefreshTokenRequest;
import com.medicalfile.app.service.security.IAuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/api/auth/v1/")
public class AuthenticationController {
    private final IAuthenticationService authenticationService;

    public AuthenticationController(IAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/token")
    public ResponseEntity<AuthenticationResponse> jwtToken(@RequestBody AuthenticationRequest authenticationRequest){
        return ResponseEntity.ok(authenticationService.accessToken(authenticationRequest.getUsername(),authenticationRequest.getPassword()));
    }

    @PostMapping("/refreshToken")
    public ResponseEntity<AuthenticationResponse> jwtToken( @RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest.getRefreshToken()));

    }
}
