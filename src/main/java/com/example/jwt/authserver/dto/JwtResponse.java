package com.example.jwt.authserver.dto;

import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class JwtResponse {
    String token;
}
