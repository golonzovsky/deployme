package com.golonzovsky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DeploymeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeploymeApplication.class, args);
    }
}


@RestController
@RequestMapping("/")
class HalloController {

    @GetMapping String hello() { return "hallo stranger"; }
}