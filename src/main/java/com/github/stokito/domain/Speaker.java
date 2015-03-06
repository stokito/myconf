package com.github.stokito.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Speaker {
    @Id @GeneratedValue
    private int id;
    @Column(nullable = false, length = 35)
    private String firstName;
    @Column(nullable = false, length = 35)
    private String lastName;
    @Column(length = 20)
    private String country;
    @Column(length = 20)
    private String company;
    @Column(columnDefinition="text")
    private String descritpion;
    @Column(columnDefinition="image")
    private byte[] photo;
}
