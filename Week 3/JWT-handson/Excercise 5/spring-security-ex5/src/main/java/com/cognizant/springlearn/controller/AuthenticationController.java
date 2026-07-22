package com.cognizant.springlearn.controller;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        LOGGER.info("Start");

        String user = getUser(authHeader);

        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();

        map.put("token", token);

        LOGGER.info("End");

        return map;
    }

    private String getUser(String authHeader) {

        String encodedCredentials =
                authHeader.substring("Basic ".length());

        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String decoded =
                new String(decodedBytes, StandardCharsets.UTF_8);

        return decoded.substring(0, decoded.indexOf(":"));
    }

    private String generateJwt(String user) {

        JwtBuilder builder = Jwts.builder();

        builder.setSubject(user);

        // Set the token issue time as current time
        builder.setIssuedAt(new Date());

        // Set the token expiry as 20 minutes from now
        builder.setExpiration(
                new Date(
                        (new Date()).getTime() + 1200000
                )
        );

        builder.signWith(
                SignatureAlgorithm.HS256,
                "secretkey"
        );

        String token = builder.compact();

        LOGGER.debug("Generated Token : {}", token);

        return token;
    }

}