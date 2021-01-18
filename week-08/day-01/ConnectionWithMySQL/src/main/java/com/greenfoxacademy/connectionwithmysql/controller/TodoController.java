package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    @GetMapping("/todo")
    public String listUnDone(@RequestParam Boolean isActive, Model model){
        model.addAttribute("todos",todoService.getAllnotDone(isActive));

        return "todolist";
    }




}
