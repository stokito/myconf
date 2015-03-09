package com.github.stokito.service;

import com.github.stokito.domain.Sponsor;
import org.springframework.data.repository.CrudRepository;

public interface SponsorService extends CrudRepository<Sponsor, Integer> {
}
