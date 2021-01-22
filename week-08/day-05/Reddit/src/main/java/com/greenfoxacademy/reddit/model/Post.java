package com.greenfoxacademy.reddit.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private Integer counter = 0;
    private String title;
    private String url;
    private Timestamp timestamp;

    public Post() {
        Date date = new Date();
        this.timestamp = new Timestamp(date.getTime());
    }

    public Post(String title) {

        this.title = title;


    }


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
