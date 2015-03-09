package com.github.stokito.service;

import com.github.stokito.domain.Talk;
import org.springframework.data.repository.CrudRepository;

public interface TalkService extends CrudRepository<Talk, Integer> {
}
