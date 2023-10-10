package com.claculater.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuickPollController {

    @Autowired
    private QuickPollService QuickPollService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("result", 0.0); // Initialize result to 0.0
        return "index";
    }

}
