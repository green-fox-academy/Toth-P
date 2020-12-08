package com.greenfoxacademy.animals;

public abstract class LayingWithEggs extends Animal{

    @Override
    public String breed() {
        return "laying eggs";
    }

    @Override
    public abstract String sleep();

    @Override
    public abstract String eat();
}
