package com.medicalfile.app.service.security;


import com.medicalfile.app.dto.AuthenticationResponse;

public interface IAuthenticationService {
    AuthenticationResponse accessToken(String username, String password);
    AuthenticationResponse refreshToken(String refreshToken);

}
