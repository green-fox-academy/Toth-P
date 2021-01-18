package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class TodoController {

    TodoService todoService;


    @Autowired
    TodoController(TodoService todoService){
        this.todoService=todoService;
    }



    @GetMapping({"/", "/list"})
    public String list(Model model,  @RequestParam(required = false) Boolean isActive){

        model.addAttribute("todos",todoService.getAllTodo());

        return "todolist";
    }

    @GetMapping("/todo")
    public String listUnDone(@RequestParam Boolean isActive, Model model){
        model.addAttribute("todos",todoService.getAllUndone(isActive));

        return "todolist";
    }

    @GetMapping("/add")
    public String addNewTodo (){
        return "newTodo";
    }

    @PostMapping("/add")
    public String saveNewTodo (String title){
        todoService.SaveTodo(title);
        return "redirect:/";
    }

    @PostMapping("/{id}/delete")
    public String deleteToDo(@PathVariable long id) {
        todoService.deleteTodo(id);
        return "redirect:/";
    }


}
