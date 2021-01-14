package com.greenfoxacademy.programmerfoxclub.Service;

import com.greenfoxacademy.programmerfoxclub.Model.Fox;
import com.greenfoxacademy.programmerfoxclub.Model.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InformationService {

    public LoginService loginService;

    @Autowired
    InformationService(LoginService loginService) {
        this.loginService = loginService;
    }



    public String foxFood() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getFood();

    }

    public String foxDrink() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getDrink();

    }
    public Integer foxTricks() {
        if (loginService.getFoxList().get(loginService.getFoxList().size() - 1).getTrickList().size() == 0){
            return 0;
        }
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getTrickList().size();

    }

    public List<String> actualFoxTricks() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getTrickList();

    }


    public String foxName() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getName();

    }


}
