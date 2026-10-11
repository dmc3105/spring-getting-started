package ru.dmc3105.test2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.dmc3105.test2.repository.UserRepository;
import ru.dmc3105.test2.responses.GreetingResponse;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping("")
    public GreetingResponse greeting(
            @RequestParam(defaultValue = "World") String name
    )
    {
        return new GreetingResponse(1, "Hello, %s".formatted(name));
    }
}
