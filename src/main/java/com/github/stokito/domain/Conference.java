package com.github.stokito.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Conference {
    @Id @GeneratedValue
    private int id;
    private String name;
    private String description;

    private Date startDate;
    private Date endDate;

    private String address;
    private byte[] logo;

    private List<Sponsor> sponsors;
    private List<User> participants;
    private List<User> organizers;
    private List<User> committee;
    private List<Talk> talks;
}
