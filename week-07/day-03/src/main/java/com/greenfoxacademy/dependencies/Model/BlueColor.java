package com.greenfoxacademy.dependencies.Model;

import com.greenfoxacademy.dependencies.Service.MyColor;

//@Service
public class BlueColor implements MyColor {

    @Override
    public String printColor() {
        return "It is blue in color...";
    }
}
