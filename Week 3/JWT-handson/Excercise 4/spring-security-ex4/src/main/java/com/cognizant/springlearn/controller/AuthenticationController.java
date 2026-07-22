package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
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

        LOGGER.debug("Authorization Header : {}", authHeader);

        String user = getUser(authHeader);

        LOGGER.debug("User : {}", user);

        Map<String, String> map = new HashMap<>();

        map.put("token", "");

        LOGGER.info("End");

        return map;
    }

    private String getUser(String authHeader) {

        LOGGER.info("Inside getUser()");

        String encodedCredentials =
                authHeader.substring("Basic ".length());

        LOGGER.debug("Encoded Credentials : {}", encodedCredentials);

        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String decodedCredentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        LOGGER.debug("Decoded Credentials : {}", decodedCredentials);

        String user =
                decodedCredentials.substring(
                        0,
                        decodedCredentials.indexOf(":"));

        LOGGER.debug("User : {}", user);

        return user;
    }

}