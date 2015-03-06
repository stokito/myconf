package com.github.stokito.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Talk {
    @Id @GeneratedValue
    private int id;

    private String name;
    private String description;
    private String format;
    private String language;
    private Speaker speaker;
    private TalkStatus status;
    private List<User> participants;
    private String video;
    private String presentation;


}
