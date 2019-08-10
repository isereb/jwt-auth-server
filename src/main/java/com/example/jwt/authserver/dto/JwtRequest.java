package com.example.jwt.authserver.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class JwtRequest {
    private String username;
    private String password;
}
