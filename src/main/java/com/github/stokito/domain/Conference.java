package com.github.stokito.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Conference {
    @Id @GeneratedValue
    private int id;
    private String name;
    @Column(columnDefinition="text")
    private String description;

    private Date startDate;
    private Date endDate;

    private String address;
    @Column(columnDefinition="image")
    private byte[] logo;
    @ManyToOne
    private List<Sponsor> sponsors;
    private List<User> participants;
    private List<User> organizers;
    private List<User> committee;
    private List<Talk> talks;
}
