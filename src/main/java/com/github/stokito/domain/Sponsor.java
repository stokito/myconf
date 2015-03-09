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

    public SponsorType getType() {
        return type;
    }

    public void setType(SponsorType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

}
