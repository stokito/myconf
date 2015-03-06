package com.github.stokito.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SponsorType {
    @Id @GeneratedValue
    private int id;
    private String name;
}
