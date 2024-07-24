package com.example.sx2316079.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    private int id;
    private String username;
    private String password;
    private String address;
}
