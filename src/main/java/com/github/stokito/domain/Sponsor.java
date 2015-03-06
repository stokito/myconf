package com.github.stokito.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Sponsor {
    @Id @GeneratedValue
    private int id;

    private String name;
    private SponsorType type;
    private String description;
    private String url;
    private byte[] logo;
    private List<User> users;

}
