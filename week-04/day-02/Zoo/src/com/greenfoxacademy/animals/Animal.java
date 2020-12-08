package com.greenfoxacademy.animals;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;


    public String getName() {
        return this.name;
    }

    public abstract String breed();

    public abstract String sleep();

    public abstract String eat();


}
