package com.greenfoxacademy.dependencies;

import com.greenfoxacademy.dependencies.Service.MyColor;
import com.greenfoxacademy.dependencies.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DependenciesApplication.class, args);
    }


    private MyColor myColor;
    private Printer printer;

    @Autowired
    DependenciesApplication(Printer printer, MyColor color) {
        this.printer = printer;
        this.myColor = color;
    }


    @Override
    public void run(String... args) throws Exception {
        printer.log(myColor.printColor());

    }
}




