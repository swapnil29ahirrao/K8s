package com.example.callingapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Slf4j
@RequestMapping
@RestController
public class CallingController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String getResponse() throws URISyntaxException {
        ResponseEntity<String> response=restTemplate.getForEntity(new URI("http://hello-app-service:8080"),String.class);
        log.info(response.toString());
        return response.getBody();
    }

}
