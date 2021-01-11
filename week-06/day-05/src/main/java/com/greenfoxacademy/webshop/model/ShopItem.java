package com.greenfoxacademy.webshop.model;

import java.text.DecimalFormat;

public class ShopItem {
    private String name;
    private String description;
    private Double price;
    private Integer quantityOfStock;
    private String type;
    private String currency;

    public ShopItem(String name, String description, Double price, Integer quantityOfStock, String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
        this.type = type;
        this.currency = "Ft";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(Integer quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public static final DecimalFormat df2 = new DecimalFormat("#.00");

    public String getFormatedPrice() {
        return df2.format(this.getPrice()) + " " + this.getCurrency();

    }

}