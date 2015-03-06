package com.github.stokito.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Speaker {
    @Id @GeneratedValue
    private int id;

    private String name;
    private String country;
    private String company;
    private String descritpion;
    private byte[] photo;
}
