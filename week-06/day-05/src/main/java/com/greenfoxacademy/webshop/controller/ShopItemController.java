package com.greenfoxacademy.webshop.controller;

import com.greenfoxacademy.webshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class ShopItemController {

    List<ShopItem> shopItems = new ArrayList<>();

    public ShopItemController() {
        shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5, "Clothes and Shoes"));
        shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2, "Electronics"));
        shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0, "Beverages and Snacks"));
        shopItems.add(new ShopItem("Wokin", "Chicken with fried rice with WOKIN sauce", 119.0, 100, "Beverages and Snacks"));
        shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1, "Clothes and Shoes"));

    }

    @GetMapping("/webshop")
    public String helloWorld() {
        return "index";
    }

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("shopItems", shopItems);
        return "webshop";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("shopItems", getQuantityOfStock());
        return "webshop";
    }


    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("shopItems", getCheapestFirst());
        return "webshop";
    }


    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("shopItems", getNike());
        return "webshop";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        OptionalDouble average = getAverage();
        if (average.isPresent()) {
            model.addAttribute("text", "Average Stock: ");
            model.addAttribute("value", average.getAsDouble());
            return "filtered";
        } else
            model.addAttribute("text", "Average Stock: ");
        model.addAttribute("value", "Out of Stock");
        return "filtered";
    }

    @GetMapping("/most-expensive")
    public String mostExpensive(Model model) {
        Optional<ShopItem> asd = getMostExpensive();
        if (asd.isPresent()) {
            model.addAttribute("text", "Most Expensive: ");
            model.addAttribute("value", asd.get().getName());
            return "filtered";
        } else
            model.addAttribute("text", "Most Expensive: ");
        model.addAttribute("value", "Out of Stock");
        return "filtered";
    }


    @PostMapping("/search")
    public String search(@RequestParam String search, Model model) {
        model.addAttribute("shopItems", getSearch(search));
        return "/webshop";
    }

    @GetMapping("/more-filters")
    public String moreFilters(Model model) {
        model.addAttribute("shopItems", shopItems);
        return "more-filters";
    }

    @GetMapping("clothes-and-shoes")
    public String clothesAndShoes(Model model) {
        model.addAttribute("shopItems", getFilteredByType("Clothes and Shoes"));
        return "more-filters";
    }

    @GetMapping("/electronics")
    public String electronics(Model model) {
        model.addAttribute("shopItems", getFilteredByType("Electronics"));
        return "more-filters";
    }

    @GetMapping("/beverages-and-snacks")
    public String beveragesAndSnacks(Model model) {
        model.addAttribute("shopItems", getFilteredByType("Beverages and Snacks"));
        return "more-filters";
    }

    @GetMapping("/euro")
    public String euro(Model model) {
        model.addAttribute("shopItems", getEuro());
        return "more-filters";
    }

    @GetMapping("/huf")
    public String huf(Model model) {
        model.addAttribute("shopItems", getHuf());
        return "more-filters";
    }


    private List<ShopItem> getSearch(String input) {
        return shopItems
                .stream()
                .filter(f -> f.getName().toLowerCase().contains(input.toLowerCase()) || f.getDescription().toLowerCase().contains(input.toLowerCase()))
                .collect(Collectors.toList());
    }


    private List<ShopItem> getQuantityOfStock() {
        return shopItems
                .stream()
                .filter(f -> f.getQuantityOfStock() != 0)
                .collect(Collectors.toList());
    }

    private List<ShopItem> getCheapestFirst() {
        return shopItems
                .stream()
                .sorted(Comparator.comparingDouble(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    private List<ShopItem> getNike() {
        return shopItems
                .stream()
                .filter(f -> f.getName().toLowerCase().contains("nike") || f.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
    }

    private OptionalDouble getAverage() {
        return shopItems
                .stream()
                .mapToDouble(ShopItem::getQuantityOfStock)
                .average();

    }

    private Optional<ShopItem> getMostExpensive() {
        return shopItems
                .stream()
                .max(Comparator.comparingDouble(ShopItem::getPrice));


    }

    private List<ShopItem> getFilteredByType(String type) {
        return shopItems
                .stream()
                .filter(f -> f.getType().equals(type))
                .collect(Collectors.toList());
    }

    private List<ShopItem> getEuro() {
        if (shopItems.get(0).getCurrency() == "Ft") {
            return shopItems.stream()
                    .peek(v -> v.setCurrency("€"))
                    .peek(v -> v.setPrice(v.getPrice() / 350))
                    .collect(Collectors.toList());
        }

        return shopItems;

    }

    private List<ShopItem> getHuf() {
        if (shopItems.get(0).getCurrency() == "€") {
            return shopItems.stream()
                    .peek(v -> v.setCurrency("Ft"))
                    .peek(v -> v.setPrice(v.getPrice() * 350))
                    .collect(Collectors.toList());
        }

        return shopItems;
    }


}