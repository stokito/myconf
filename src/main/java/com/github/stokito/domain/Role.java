package com.github.stokito.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Role {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String title;
}