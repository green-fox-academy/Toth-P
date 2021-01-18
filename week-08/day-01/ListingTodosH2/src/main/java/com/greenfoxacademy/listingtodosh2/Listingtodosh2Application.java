package com.greenfoxacademy.listingtodosh2;

import com.greenfoxacademy.listingtodosh2.model.Todo;
import com.greenfoxacademy.listingtodosh2.repository.TodoRepository;
import com.greenfoxacademy.listingtodosh2.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodosh2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Listingtodosh2Application.class, args);
    }

    TodoService todoService;

    @Autowired
    public Listingtodosh2Application(TodoService todoService) {
        this.todoService = todoService;
    }


    @Override
    public void run(String... args) throws Exception {
        todoService.SaveTodo("Start the day");
        todoService.SaveTodo("End the day");
    }
}
