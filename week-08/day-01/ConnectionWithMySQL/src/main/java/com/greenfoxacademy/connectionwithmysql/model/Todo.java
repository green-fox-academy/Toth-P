package com.greenfoxacademy.connectionwithmysql.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Setter
@Getter
@NoArgsConstructor
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private boolean urgent = false;
    private boolean done = false;

    public Todo(String title) {
        this.title = title;
        this.urgent= false;
        this.done = false;
    }

    public Todo(String title, boolean urgent, boolean done ) {
        this.title = title;
        this.urgent= urgent;
        this.done = done;
    }

}
