package com.greenfoxacademy.animals;

public class Mammal extends Animal {

    public Mammal(String mammal) {
        name = mammal;

    }

    @Override
    public String breed() {
        return "viviparous";
    }

    @Override
    public String sleep() {
        return null;
    }

    @Override
    public String eat() {
        return null;
    }
}
