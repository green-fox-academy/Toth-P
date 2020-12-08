package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        name = "Electric Guitar";
        numberOfStrings = 6;
    }

    public ElectricGuitar(int number) {
        this.numberOfStrings = number;
        name = "Electric Guitar";
    }

    @Override
    public String sound() {
        return "Twang";
    }
}

