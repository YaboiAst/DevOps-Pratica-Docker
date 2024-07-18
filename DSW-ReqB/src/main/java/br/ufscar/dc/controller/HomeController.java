package br.ufscar.dc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/home")
    public String home2() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
