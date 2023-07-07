package com.springproject.springprojectlv4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringProjectLv4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectLv4Application.class, args);
    }

}
