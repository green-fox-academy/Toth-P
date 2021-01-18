package com.greenfoxacademy.listingtodosh2.repository;

import com.greenfoxacademy.listingtodosh2.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
