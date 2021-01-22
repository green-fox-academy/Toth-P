package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class PostController {

    private PostService postService;


    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String list(Model model, String sort, Integer number) {
        if (sort == null) {
            sort = "popular";
        }
        if (number == null) {
            number = 1;
        }

        if (sort.equals("popular")) {
            model.addAttribute("postList", postService.getPopularFirst(number));
        } else if (sort.equals("newest")) {
            model.addAttribute("postList", postService.getNewestFirst(number));
        } else if (sort.equals("oldest")) {
            model.addAttribute("postList", postService.getOldestFirst(number));
        }

        model.addAttribute("numberOfPagesList", postService.numberOfPages());
        model.addAttribute("number", number);
        model.addAttribute("sort", sort);
        return "index";
    }

    @GetMapping("/submit")
    public String addNewPost() {
        return "submit-post";
    }

    @PostMapping("/submit")
    public String saveNewPost(@ModelAttribute Post post) {
        postService.savePost(post);
        return "redirect:/";
    }


    @GetMapping("/actual-post/{id}")
    public String actualPost(@PathVariable long id, Model model) {
        model.addAttribute("actualPost", postService.getPostById(id));
        return "actual-post";
    }

    @GetMapping("upvote/{id}")
    public String upvotePost(@PathVariable Long id, @ModelAttribute Post post) {
        postService.upvotePost(id);
        return "redirect:/";
    }

    @GetMapping("downvote/{id}")
    public String downvotePost(@PathVariable Long id, @ModelAttribute Post post) {
        postService.downvotePost(id);
        return "redirect:/";
    }


//    @GetMapping("/popular")
//    public String getPopularFirst(Model model, @RequestParam(required = false, defaultValue = "1") Integer number) {
//
//        model.addAttribute("postList", postService.getPopularFirst(number));
//        model.addAttribute("numberOfPagesList", postService.numberOfPages());
//        model.addAttribute("number", number);
//
//
//        return "index";
//    }
//
//    @GetMapping("/newest")
//    public String getNewestFirst(Model model) {
//        model.addAttribute("postList", postService.getNewestFirst(1));
//
//        return "index";
//    }
//
//    @GetMapping("/oldest")
//    public String getOldestFirst(Model model) {
//        model.addAttribute("postList", postService.getOldestFirst(1));
//
//        return "index";
//    }


}
