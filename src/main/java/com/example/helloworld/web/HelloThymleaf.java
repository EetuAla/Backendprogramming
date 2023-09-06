package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;



@Controller
public class HelloThymleaf {
	@GetMapping("/hello")
    public String hello(@RequestParam String name, @RequestParam int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "thymleafTest";
    }
}