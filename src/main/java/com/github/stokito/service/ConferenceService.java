package com.github.stokito.service;

import com.github.stokito.domain.Conference;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConferenceService extends CrudRepository<Conference, Integer> {
    List<Conference> findByName(String name);
}
