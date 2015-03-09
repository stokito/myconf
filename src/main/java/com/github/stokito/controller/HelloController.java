package com.github.stokito.controller;

import com.github.stokito.domain.Conference;
import com.github.stokito.domain.Sponsor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

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
        Conference conference = new Conference();
        conference.setName("Conf1");
        conference.setDescription("Conf1 desc");
        entityManager.persist(conference);
        return "hello";
    }
    @RequestMapping("/list")
    public ModelAndView list(){
        List<Conference> conferences = entityManager.createQuery("from Conference", Conference.class).getResultList();
        ModelAndView maw = new ModelAndView("/conference/list");
        maw.addObject("conferences", conferences);
        return maw;
    }
}
