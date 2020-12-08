package com.greenfoxacademy.music;

public class Violin extends StringedInstrument {

    public Violin() {
        name = "Violin";
        numberOfStrings = 4;
    }

    @Override
    public String sound() {
        return "Screech";
    }
}
