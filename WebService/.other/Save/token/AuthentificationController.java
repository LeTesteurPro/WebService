/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webserviceVoiture.webserviceVoiture.controller;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.JwsHeader;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author TOAVINA
 */

@RestController
@RequestMapping("/test")
public class AuthentificationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    JwtEncoder jwtEncoder;
    
    @GetMapping("/test_one")
    @PreAuthorize("hasAuthority('SCOPE_ROLE_USER')")
    public Authentication tester(Authentication authentication){
        //return "ra ohatra ka mahita an ity enao de efa mety izy izay";
        return authentication;
    }
    
    @PostMapping("/login")
    public Map<String,String> login(String username,String password){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password)
        );
        
        Instant instant = Instant.now();
        String roles = authentication.getAuthorities().stream().map(a->a.getAuthority()).collect(Collectors.joining(", "));
        System.out.println(roles);
        JwtClaimsSet jwtClaimsSet = JwtClaimsSet.builder()
                .issuedAt(instant)
                .expiresAt(instant.plus(30,ChronoUnit.MINUTES))
                .subject(username)
                .claim("scope",roles)
                .build();
        
        JwtEncoderParameters jwtEncoderParameters = 
                JwtEncoderParameters.from(
                        JwsHeader.with(MacAlgorithm.HS512).build(),
                        jwtClaimsSet
                );
        
        String jwt = jwtEncoder.encode(jwtEncoderParameters).getTokenValue();
        return Map.of("access-token",jwt);
    }
}
