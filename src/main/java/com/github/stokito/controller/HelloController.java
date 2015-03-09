package com.github.stokito.controller;

import com.github.stokito.domain.Sponsor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Controller
public class HelloController {

    @PersistenceContext
    EntityManager entityManager;

    @RequestMapping("/")
    @Transactional
    public String index() {
        Sponsor sponsor = new Sponsor();
        sponsor.setName("Sponsor 1");
        sponsor.setDescription("Sponsor 1");
        entityManager.persist(sponsor);
        return "hello";
    }
}