package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    private PostService postService;

    @Autowired
    public RedditApplication(PostService postService){
        this.postService = postService;
    }

    @Override
    public void run(String... args) throws Exception {
//
//        postService.savePost(new Post("My first post"));
//        postService.savePost(new Post("My asd post"));
//        postService.savePost(new Post("My dsad post"));
    }
}
