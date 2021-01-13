package com.greenfoxacademy.dependencies.Controller;

import com.greenfoxacademy.dependencies.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class utilityController {

    private UtilityService utilityService;

    @Autowired
    utilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String allUtilities() {
        return "index";
    }

    @GetMapping("/useful/colored")
    public String coloredBackground(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "color";
    }

    @GetMapping("/useful/email")
    public String emailV(@RequestParam String email, Model model) {
        model.addAttribute("email", utilityService.validateEmail(email).get(0));
        model.addAttribute("color", utilityService.validateEmail(email).get(1));

        return "mail";
    }


    @GetMapping("/useful/caesar-encoding")
    public String caesarEncoder(@RequestParam String encodedText, Integer encodedNumber, Model model) {
        model.addAttribute("text", utilityService.caesar(encodedText, encodedNumber));
        return "caesar";
    }


    @GetMapping("/useful/caesar-decoding")
    public String caesarDecoder(@RequestParam String decodedText, Integer decodedNumber, Model model) {
        model.addAttribute("text", utilityService.caesar(decodedText, (decodedNumber * -1)));
        return "caesar";
    }


}


