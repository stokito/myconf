package com.github.stokito.controller;

import com.github.stokito.domain.Conference;
import com.github.stokito.domain.Sponsor;
import com.github.stokito.domain.Talk;
import com.github.stokito.service.ConferenceService;
import com.github.stokito.service.SponsorService;
import com.github.stokito.service.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

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
    public String index(HttpServletRequest request) {
        return "hello";
    }

    @RequestMapping(value = "/addConf", method = RequestMethod.POST)
    @Transactional
    public String addConf(HttpServletRequest request) {
        Conference conference = new Conference();
        conference.setName(request.getParameter("ConfName"));
        conference.setDescription(request.getParameter("Description"));
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
