package com.greenfoxacademy.springstart.Controller;

import com.greenfoxacademy.springstart.Model.Greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRESTController {


    @RequestMapping(value = "/greeting")

    public Greeting greeting(@RequestParam String name) {
        return new Greeting("Hello " + name + "!");
    }


}
