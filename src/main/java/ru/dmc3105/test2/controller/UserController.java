package ru.dmc3105.test2.controller;

import org.springframework.web.bind.annotation.*;
import ru.dmc3105.test2.entity.UserEntity;
import ru.dmc3105.test2.repository.UserRepository;
import ru.dmc3105.test2.request.UserRegisterRequest;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<UserEntity> index()
    {
        return repository.findAll();
    }

    @PostMapping
    public void register(@RequestBody UserRegisterRequest request)
    {
        UserEntity user = new UserEntity(request.name(), request.age());
        repository.save(user);
    }
}
