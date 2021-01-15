package com.greenfoxacademy.programmerfoxclub.Controller;

import com.greenfoxacademy.programmerfoxclub.Model.Fox;
import com.greenfoxacademy.programmerfoxclub.Service.LoginService;
import com.greenfoxacademy.programmerfoxclub.Service.NutritionService;
import com.greenfoxacademy.programmerfoxclub.Service.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    public LoginService loginService;

    public NutritionService nutritionService;
    public TrickService trickService;
    public Fox fox;

    @Autowired
    MainController(LoginService loginService, NutritionService nutritionService, TrickService trickService) {
        this.loginService = loginService;
        this.nutritionService = nutritionService;
        this.trickService = trickService;
    }

    @GetMapping("/")

    public String mainPage( @RequestParam(defaultValue = "Mr. Fox") String name, Model model) {
        if( this.fox == null){
            return "login";
        }

        model.addAttribute("name", fox.getName());
        model.addAttribute("trickList", fox.getTrickList());
        model.addAttribute("food", fox.getFood());
        model.addAttribute("drink", fox.getDrink());
        model.addAttribute("tricks", fox.getTrickList().size());
        model.addAttribute("actualTricks", fox.getTrickList());


        return "index";
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("foxList", loginService.getFoxList());
        return "login";
    }

    @PostMapping("/login")
    public String postName(@RequestParam String name, Model model) {
        this.fox = loginService.foxLogin(name);
        model.addAttribute("text", fox.getName());
        return "redirect:/?name=" + name;
    }

    @GetMapping("/nutrition-store")
    public String nutritionStore(Model model) {
        model.addAttribute("foodList", nutritionService.getFoodList());
        model.addAttribute("drinkList", nutritionService.getDrinkList());

        return "nutrition";
    }

    @PostMapping("/nutrition-store")
    public String postNutrition(@RequestParam String food, String drink, Model model) {
        nutritionService.foxFood(food, fox);
        nutritionService.foxDrink(drink, fox);
        model.addAttribute("food", fox.getFood());
        model.addAttribute("drink", fox.getDrink());
        return "redirect:/?name=" + fox.getName();
    }

    @GetMapping("/trick-center")
    public String trickCenter(Model model) {
        model.addAttribute("trickList", trickService.getTrickList());
        return "trickCenter";
    }

    @PostMapping("/trick-center")
    public String postTrick(@RequestParam String trick, Model model) {
        trickService.foxTricks(trick, fox);
        model.addAttribute("trick", fox.getTrickList());

        return "redirect:/?name=" + fox.getName();
    }


}
