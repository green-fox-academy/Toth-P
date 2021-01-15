package com.greenfoxacademy.programmerfoxclub.Service;

import com.greenfoxacademy.programmerfoxclub.Model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class LoginService {

    private List<Fox> foxList;

    @Autowired
    LoginService() {
        foxList = new ArrayList<>();
    }


    public Fox foxLogin(String name) {
        Optional<Fox> fox = foxList.stream().filter(f -> f.getName().equals(name)).findFirst();
        if (fox.isPresent()) {
            return fox.get();
        } else {
            Fox fox1 = new Fox(name);
            foxList.add(fox1);
            return fox1;

        }
    }



    public List<Fox> getFoxList() {
        return foxList;
    }
}
