package com.greenfoxacademy.springstart.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@org.springframework.stereotype.Controller
public class Controller {





    @RequestMapping(value="/hello")
    @ResponseBody
    public String Hello(){
        return "Hello";
    }
}
