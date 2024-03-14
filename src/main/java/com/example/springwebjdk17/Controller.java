package com.example.springwebjdk17;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/public")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok().body("Hello World");
    }

    @GetMapping("/public/city")
    public ResponseEntity<String> helloCity() {
        return ResponseEntity.ok().body("Hello City");
    }

    @GetMapping("/secure")
    public ResponseEntity<String> privateSite(JwtAuthenticationToken jwtAuthToken) {
        Jwt jwt = (Jwt) jwtAuthToken.getPrincipal();
        return ResponseEntity.ok().body("Hello " + jwt.getSubject());
    }

    @GetMapping("/custom-one")
    public ResponseEntity<String> customOne(JwtAuthenticationToken jwtAuthToken) {
        Jwt jwt = (Jwt) jwtAuthToken.getPrincipal();
        return ResponseEntity.ok().body("Here's your custom one, " + jwt.getSubject());
    }
}
