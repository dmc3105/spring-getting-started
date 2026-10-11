package ru.dmc3105.test2.response;

import ru.dmc3105.test2.entity.UserEntity;

public record UserResponse
        (Long id, String name, int age) {

    public static UserResponse from(UserEntity entity)
    {
        return new UserResponse(entity.getId(), entity.getName(), entity.getAge());
    }
}
