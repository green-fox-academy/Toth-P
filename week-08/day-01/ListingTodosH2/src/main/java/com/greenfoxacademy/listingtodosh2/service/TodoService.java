package com.greenfoxacademy.listingtodosh2.service;


import com.greenfoxacademy.listingtodosh2.model.Todo;
import com.greenfoxacademy.listingtodosh2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {


    TodoRepository todoRepository;

    @Autowired
    TodoService(TodoRepository todoRepo){
        this.todoRepository=todoRepo;
    }

    public List<Todo> getAllTodo(){
        return (List<Todo>) todoRepository.findAll();
    }

    public void SaveTodo(String text){
        todoRepository.save(new Todo(text));
    }


}
