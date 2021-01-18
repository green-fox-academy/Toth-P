package com.greenfoxacademy.connectionwithmysql.service;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class TodoService {


    TodoRepository todoRepository;


    @Autowired
    TodoService(TodoRepository todoRepo) {
        this.todoRepository = todoRepo;
    }

    public List<Todo> getAllTodo() {
        return (List<Todo>) todoRepository.findAll();
    }

    public void SaveTodo(String text) {
        todoRepository.save(new Todo(text));
    }

    public List<Todo> getAllUndone(Boolean isActive) {

        return todoRepository.findAllByDone(!isActive);
    }


    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }


}

