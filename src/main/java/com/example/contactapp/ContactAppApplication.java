package com.example.contactapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ContactAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactAppApplication.class, args);
    }
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SpringAppContext springApplicationContext() {
        return new SpringAppContext();
    }

}
