package com.greenfoxacademy.programmerfoxclub.Service;

import com.greenfoxacademy.programmerfoxclub.Model.Drinks;
import com.greenfoxacademy.programmerfoxclub.Model.Foods;
import com.greenfoxacademy.programmerfoxclub.Model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class NutritionService {


    public LoginService loginService;

    @Autowired
    NutritionService(LoginService loginService) {
        this.loginService = loginService;
    }

    public List<String> getFoodList() {
        return Arrays.stream(Foods.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }


    public List<String> getDrinkList() {
        return Arrays.stream(Drinks.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }


    public String foxFood(String food) {
        loginService.getFoxList().get(loginService.getFoxList().size() - 1).setFood(food);
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getFood();

    }


    public String foxDrink(String drink) {
        loginService.getFoxList().get(loginService.getFoxList().size() - 1).setDrink(drink);
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getDrink();

    }

}
