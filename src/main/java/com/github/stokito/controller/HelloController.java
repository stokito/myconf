package com.github.stokito.controller;

import com.github.stokito.domain.Conference;
import com.github.stokito.domain.Sponsor;
import com.github.stokito.service.ConferenceService;
import com.github.stokito.service.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;

@Controller
public class HelloController {

    @Autowired
    ConferenceService conferenceService;
    @Autowired
    SponsorService sponsorService;

    @RequestMapping("/")
    @Transactional
    public String index() {
        Sponsor sponsor = new Sponsor();
        sponsor.setName("Sponsor 1");
        sponsor.setDescription("Sponsor 1");
        sponsorService.save(sponsor);

        Conference conference = new Conference();
        conference.setName("Conf1");
        conference.setDescription("Conf1 desc");
        conferenceService.save(conference);
        return "hello";
    }

    @RequestMapping("/conferencelist")
    public ModelAndView conferenceList(){
        Iterable<Conference> conferences = conferenceService.findAll();
        ModelAndView maw = new ModelAndView("/conference/list");
        maw.addObject("conferences", conferences);
        return maw;
    }
    @RequestMapping("/sponsorlist")
    public ModelAndView sponsorList(){
        Iterable<Sponsor> sponsors = sponsorService.findAll();
        ModelAndView maw = new ModelAndView("/sponsor/list");
        maw.addObject("sponsors", sponsors);
        return maw;
    }
}
