package com.example.quickpoll.quickpoll;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class QuickpollController {

    private QuickpollService QuickpollService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("result", 0.0); // Initialize result to 0.0
        return "index";
    }

}
