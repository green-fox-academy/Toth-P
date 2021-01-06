package com.greenfoxacademy.springstart.Controller;

import com.greenfoxacademy.springstart.Model.Greeting;
import com.greenfoxacademy.springstart.Model.HelloToAllTheWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.awt.*;

//@RestController
//public class randomHelloController {
//
//
//    @RequestMapping(value = "/greet")
//
//    public String hello() {
//
//        HelloToAllTheWorld hello = new HelloToAllTheWorld();
//        return hello.getHello();
//    }
@Controller
public class randomHelloController {


    @RequestMapping(value = "/greet")

    public String greeting(Model model, @RequestParam String color, @RequestParam String size) {
        model.addAttribute("color", color);
        model.addAttribute("size", size);
        HelloToAllTheWorld hello = new HelloToAllTheWorld();
        model.addAttribute("hello",hello.getHello());


        return "greeting2";
    }




}

