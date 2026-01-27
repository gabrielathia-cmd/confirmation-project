package net.nsaglobal.confirmationproject.controllers;

import net.nsaglobal.confirmationproject.dtos.teste.RequestTest;
import net.nsaglobal.confirmationproject.service.TesteService;
import net.nsaglobal.confirmationproject.dtos.teste.ResponseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyControllers {

//Attributes

    private TesteService service;

//Constructor - Dependency Injection

    @Autowired
    public CompanyControllers(TesteService service) {
        this.service = service;
    }

//Methods

    @GetMapping("/")
    public String testingCloud() {
        return "Hello World!";
    }

    @GetMapping("/legal")
    public String testingCloud2() {
        return "Se pá que a parada ficou bem maneira, né? Meu mano predela, meu mano predela";
    }

    @PostMapping("/criar-teste")
    public ResponseEntity<ResponseTest> createTest(@RequestBody RequestTest request) {
        ResponseTest responseTest = service.saveEntity(request);
        return ResponseEntity.ok(responseTest);
    }
}
