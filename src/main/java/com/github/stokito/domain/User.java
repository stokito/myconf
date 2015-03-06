package com.github.stokito.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id @GeneratedValue
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String city;
    private String company;
    private String jobTitle;
}
