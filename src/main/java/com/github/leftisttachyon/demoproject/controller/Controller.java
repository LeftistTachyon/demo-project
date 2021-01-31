package com.github.leftisttachyon.demoproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String index(@RequestParam(value = "friends", required = false) Integer friends,
                        @RequestParam(value = "roger", required = false) String roger, Model m) {
        log.info(String.valueOf(friends));
        m.addAttribute("friends", friends);
        m.addAttribute("message", "Rodger, " + roger + "!");
        return "index";
    }

    @GetMapping("/hello")
    public String meme() {
        return "hello";
    }
}
