package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar() {
        name = "Bass Guitar";
        numberOfStrings=4;
    }

    public BassGuitar(int number) {
        this.numberOfStrings = number;
        name = "Bass Guitar";
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}

