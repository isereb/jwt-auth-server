package com.example.jwt.authserver.dto;

import lombok.Value;

@Value
public class JwtRequest {
    String username;
    String password;
}
