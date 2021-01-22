package com.greenfoxacademy.reddit.service;


import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {
    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPost() {
        return (List<Post>) postRepository.findAll();
    }


    public void savePost(Post post) {
        postRepository.save(post);
    }

    public Post getPostById(Long id) {
        if (postRepository.findById(id).isPresent()) {
            return postRepository.findById(id).get();
        }
        return null;
    }

    public void upvotePost(Long id) {
        if (getPostById(id) != null) {
            getPostById(id).setCounter(getPostById(id).getCounter() + 1);
        }
        savePost(getPostById(id));

    }

    public void downvotePost(Long id) {
        if (getPostById(id) != null) {
            getPostById(id).setCounter(getPostById(id).getCounter() - 1);
        }
        savePost(getPostById(id));
    }



    public List<Integer> numberOfPages() {
        List<Integer> numbers = new ArrayList<>();
        Integer numberOfPosts = getAllPost().size();
        int counter = 1;
        for (int i = 0; i < numberOfPosts; i++) {
            if (i%10==0){
                numbers.add(counter);
                counter++;
            }

        }
        return numbers;
    }






    public List<Post> getPopularFirst(Integer pagenumber) {

        return getAllPost().stream().sorted(Comparator.comparingInt(Post::getCounter).reversed())
                .skip(pagenumber * 10 - 10)
                .limit(10)
                .collect(Collectors.toList());

    }


    public List<Post> getNewestFirst(Integer pagenumber) {

        return getAllPost().stream().sorted(Comparator.comparing(Post::getTimestamp).reversed())
                .skip(pagenumber * 10 - 10)
                .limit(10)
                .collect(Collectors.toList());

    }



    public List<Post> getOldestFirst(Integer pagenumber) {

        return getAllPost().stream().sorted(Comparator.comparing(Post::getTimestamp))
                .skip(pagenumber * 10 - 10)
                .limit(10)
                .collect(Collectors.toList());

    }




}
