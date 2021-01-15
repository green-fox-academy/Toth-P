package com.greenfoxacademy.programmerfoxclub.Service;

import com.greenfoxacademy.programmerfoxclub.Model.Fox;
import com.greenfoxacademy.programmerfoxclub.Model.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrickService {


    public LoginService loginService;

    @Autowired
    TrickService(LoginService loginService) {
        this.loginService = loginService;
    }

    public List<String> getTrickList() {
        return Arrays.stream(Tricks.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }


    public Fox foxTricks(String trick, Fox fox) {
        if (fox.getTrickList().contains(trick)){
            return fox;
        }else
        fox.getTrickList().add(trick);

        return fox;

    }


}
