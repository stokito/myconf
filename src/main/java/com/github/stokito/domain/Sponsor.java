package com.github.stokito.domain;

import javax.persistence.*;
import java.net.URL;

@Entity
public class Sponsor {
    @Id @GeneratedValue
    private int id;

    private String name;
    @ManyToOne
    private SponsorType type;
    private String description;
    private URL url;
    private byte[] logo;
//    private List<User> users;

}
