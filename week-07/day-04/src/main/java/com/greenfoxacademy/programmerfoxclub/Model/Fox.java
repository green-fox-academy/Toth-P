package com.greenfoxacademy.programmerfoxclub.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fox {
    private String name;
    private List<String> trickList = new ArrayList<>();
    private String food = "salad";
    private String drink = "water";


    public Fox(String name) {
        this.name = name;

    }


}
