package com.github.stokito.service;

import com.github.stokito.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDaoService extends CrudRepository<User, Integer> {
    User findOneByEmail(String email);
}
