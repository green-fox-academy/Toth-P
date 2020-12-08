package com.greenfoxacademy.animals;

public class Bird extends LayingWithEggs {


    public Bird(String bird) {
        name=bird;
    }

    @Override
    public String sleep() {
        return "";
    }

    @Override
    public String eat() {
        return null;
    }
}
