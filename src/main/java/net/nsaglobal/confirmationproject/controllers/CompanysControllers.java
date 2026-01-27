package net.nsaglobal.confirmationproject.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class CompanysControllers {
    @GetMapping("/")
    public String testingCloud() {
        return "Hello World!";
    }

    @GetMapping("/legal")
    public String testingCloud2() {
        return "Se pá que a parada ficou bem maneira, né? Meu mano predela, meu mano predela";
    }
}
