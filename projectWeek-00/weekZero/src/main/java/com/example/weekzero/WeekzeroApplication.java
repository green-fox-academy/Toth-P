package com.example.weekzero;

import com.example.weekzero.Security.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class WeekzeroApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeekzeroApplication.class, args);
    }

}
