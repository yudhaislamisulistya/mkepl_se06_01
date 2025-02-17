package id.sivia.swagger_demo.controllers;

import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/hello")
@Tag(name = "Hello", description = "Simple hello world endpoint")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello, Swagger!";
    }

    @GetMapping("/apa")
    public String apa() {
        return "Apa kabar?";
    }

    @GetMapping("/siapa")
    public String siapa() {
        return "Siapa namamu?";
    }

    @GetMapping("/kapan")
    public String kapan() {
        return "Kapan kita ketemu?";
    }
}
