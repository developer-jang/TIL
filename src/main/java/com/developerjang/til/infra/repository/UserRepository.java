package com.developerjang.til.infra.repository;

import com.developerjang.til.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
