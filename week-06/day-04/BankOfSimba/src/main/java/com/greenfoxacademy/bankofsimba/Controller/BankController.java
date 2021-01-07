package com.greenfoxacademy.bankofsimba.Controller;


import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> accountList = new ArrayList<>();

    public BankController() {
        accountList.add(new BankAccount("Simba", 2000.0, "lion", true, true));
        accountList.add(new BankAccount("Rafiki", 1000.0, "mandrill", false, true));
        accountList.add(new BankAccount("Pumbaa", 30.0, "warthog", false, true));
        accountList.add(new BankAccount("Timon", 200.0, "meerkat", false, true));
        accountList.add(new BankAccount("Zazu", 800.0, "hornbill", false, true));
        accountList.add(new BankAccount("Ed", -300.0, "hyena", false, false));

    }


    @GetMapping("/show")

    public String showAccounts(Model model) {
        model.addAttribute("accounts", accountList);


        return "index";
    }

    @GetMapping("/text")

    public String showText() {
        return "HTMLception";
    }


}
