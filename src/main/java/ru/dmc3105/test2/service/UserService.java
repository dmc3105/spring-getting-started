package ru.dmc3105.test2.service;

import org.springframework.stereotype.Service;
import ru.dmc3105.test2.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

}
