package com.greenfoxacademy.programmerfoxclub.Controller;

import com.greenfoxacademy.programmerfoxclub.Model.Fox;
import com.greenfoxacademy.programmerfoxclub.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;

@Controller
public class MainController {

    LoginService loginService;

    @Autowired
    MainController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/")
    public String mainPage(@RequestParam String name, Model model) {
        model.addAttribute("name", name);

        return "index";
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("foxList", loginService.getFoxList());
        return "login";
    }

    @PostMapping("/login")
    public String postName(@RequestParam String name, Model model) {
        model.addAttribute("text", loginService.newFox(name));
        return "redirect:/?name=" + name;
    }


}
