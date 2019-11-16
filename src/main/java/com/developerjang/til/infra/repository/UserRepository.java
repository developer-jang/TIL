package com.developerjang.til.infra.repository;

import com.developerjang.til.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUserId(String userId);
}
