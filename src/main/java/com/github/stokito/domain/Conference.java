package com.github.stokito.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Conference {
    @Id @GeneratedValue
    private int id;
    private String name;
//    @Column(columnDefinition="text")
    private String description;

    private Date startDate;
    private Date endDate;
    @OneToOne
    private Address address;
//    @Column(columnDefinition="LONGVARBINARY")
    private byte[] logo;
    @OneToMany
    private Set<Sponsor> sponsors;
    @OneToMany
    private List<User> participants;
    @OneToMany
    private List<User> organizers;
    @OneToMany
    private List<User> committee;
    @OneToMany(orphanRemoval = true)
    @JoinColumn(name="conference")
    private List<Talk> talks;

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setSponsors(Set<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public List<User> getOrganizers() {
        return organizers;
    }

    public void setOrganizers(List<User> organizers) {
        this.organizers = organizers;
    }

    public List<User> getCommittee() {
        return committee;
    }

    public void setCommittee(List<User> committee) {
        this.committee = committee;
    }

    public List<Talk> getTalks() {
        return talks;
    }

    public void setTalks(List<Talk> talks) {
        this.talks = talks;
    }
}
