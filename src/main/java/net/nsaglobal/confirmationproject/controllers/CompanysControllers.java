package net.nsaglobal.confirmationproject.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class CompanysControllers {
    @GetMapping("/")
    public String testingCloud() {
        return "Hello World!";
    }
}
