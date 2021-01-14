package com.greenfoxacademy.programmerfoxclub.Service;

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



    public List<String> foxTricks(String trick) {
        loginService.getFoxList().get(loginService.getFoxList().size() - 1).getTrickList().add(trick);
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getTrickList();

    }




}
