package com.greenfoxacademy.programmerfoxclub;

import com.greenfoxacademy.programmerfoxclub.Service.InformationService;
import com.greenfoxacademy.programmerfoxclub.Service.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgrammerFoxClubApplication  {

    public static void main(String[] args) {
        SpringApplication.run(ProgrammerFoxClubApplication.class, args);
    }


}
