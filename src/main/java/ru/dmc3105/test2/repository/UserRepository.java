package ru.dmc3105.test2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dmc3105.test2.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserRepository, Long> {

        UserEntity findUserByName();
}
