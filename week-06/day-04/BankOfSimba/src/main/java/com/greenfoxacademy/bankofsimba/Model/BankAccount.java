package com.greenfoxacademy.bankofsimba.Model;

import java.text.DecimalFormat;

public class BankAccount {
    String animalType;
    String name;
    Double balance;
    Boolean isKing;
    Boolean isGood;


    public BankAccount(String name, Double balance, String animalType, Boolean king, Boolean good) {
        this.animalType = animalType;
        this.name = name;
        this.balance = balance;
        this.isKing = king;
        this.isGood = good;
    }

    public static final DecimalFormat df2 = new DecimalFormat("#.00");

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Boolean getKing() {
        return isKing;
    }

    public void setKing(Boolean king) {
        isKing = king;
    }


    public String getFormatedBalance() {
        return df2.format(this.balance) + " Zebra";

    }

    public String getStyle() {
        if (isKing) {
            return "red";
        }
        return "black";
    }

    public String getGood() {
        if (isGood) {
            return "Good";
        }
        return "Bad";
    }


}
