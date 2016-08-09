package com.golonzovsky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@SpringBootApplication
public class DeploymeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeploymeApplication.class, args);
    }
}


@RequestMapping("/")
@RestController
class DeploymeRestController {

    @GetMapping
    Message hello() {
        return new Message("hallo");
    }
}

@Data
class Message {
    final String text;
}