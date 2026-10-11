package ru.dmc3105.test2.controller;

import org.springframework.web.bind.annotation.*;
import ru.dmc3105.test2.response.GreetingResponse;

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
