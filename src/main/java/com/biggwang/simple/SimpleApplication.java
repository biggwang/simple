package com.biggwang.simple;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@RestController
@SpringBootApplication
@RequiredArgsConstructor
public class SimpleApplication {

    private final RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
    }


    @GetMapping("/simple")
    public String simple() {
        return LocalDateTime.now().toString();
    }

    @GetMapping("/biggwang-api/simple")
    public String callApi() {
        return "response: " + restTemplate.getForObject("http://localhost:7000/api/simple", String.class);
    }

}
