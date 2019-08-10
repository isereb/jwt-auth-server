package com.example.jwt.authserver.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired private PasswordEncoder encoder;

    @Override public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if (!username.equals("George"))
            throw new UsernameNotFoundException("Username not found");

        return new UserDetails() {

            @Override public Collection<? extends GrantedAuthority> getAuthorities() {
                return Collections.emptyList();
            }

            @Override public String getPassword() {
                return encoder.encode("12345");
            }

            @Override public String getUsername() {
                return "George";
            }

            @Override public boolean isAccountNonExpired() {
                return true;
            }

            @Override public boolean isAccountNonLocked() {
                return true;
            }

            @Override public boolean isCredentialsNonExpired() {
                return true;
            }

            @Override public boolean isEnabled() {
                return true;
            }
        };
    }
}
