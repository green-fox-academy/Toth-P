package com.greenfoxacademy.listingtodosh2.controller;

import com.greenfoxacademy.listingtodosh2.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TodoController {

    TodoService todoService;


    @Autowired
    TodoController(TodoService todoService){
        this.todoService=todoService;
    }



    @GetMapping({"/", "/list"})
    public String list(Model model){
        model.addAttribute("todos",todoService.getAllTodo());

        return "todolist";
    }






}
