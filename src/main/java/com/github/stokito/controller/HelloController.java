package com.github.stokito.controller;

import com.github.stokito.command.AddConferenceCommand;
import com.github.stokito.domain.Conference;
import com.github.stokito.domain.Sponsor;
import com.github.stokito.domain.Talk;
import com.github.stokito.service.ConferenceService;
import com.github.stokito.service.SponsorService;
import com.github.stokito.service.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;
import javax.validation.Valid;

@Controller
public class HelloController {

    @Autowired
    ConferenceService conferenceService;
    @Autowired
    SponsorService sponsorService;
    @Autowired
    TalkService talkService;

    @RequestMapping("/")
    @Transactional
    public ModelAndView index() {
        ModelAndView maw = new ModelAndView("hello");
        AddConferenceCommand command = new AddConferenceCommand();
        command.setDescription("");
        maw.addObject("addConf", command);
        return maw;
    }

    @RequestMapping(value = "/addConf", method = RequestMethod.POST)
    @Transactional
    public String addConf(@Valid @ModelAttribute("addConf") AddConferenceCommand conferenceForm) {
        Conference conference = new Conference();
        conference.setName(conferenceForm.getName());
        conference.setDescription(conferenceForm.getDescription());
        conferenceService.save(conference);
        return "redirect:/";
    }

    @RequestMapping("/conferenceList")
    public ModelAndView conferenceList(){
        Iterable<Conference> conferences = conferenceService.findAll();
        ModelAndView maw = new ModelAndView("/conference/list");
        maw.addObject("conferences", conferences);
        return maw;
    }
    @RequestMapping("/sponsorList")
    public ModelAndView sponsorList(){
        Iterable<Sponsor> sponsors = sponsorService.findAll();
        ModelAndView maw = new ModelAndView("/sponsor/list");
        maw.addObject("sponsors", sponsors);
        return maw;
    }
    @RequestMapping("/talkList")
    public ModelAndView talkList(){
        Iterable<Talk> talks = talkService.findAll();
        ModelAndView maw = new ModelAndView("/talk/list");
        maw.addObject("talks", talks);
        return maw;
    }
}
