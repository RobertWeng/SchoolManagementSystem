package com.example.school.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User extends SimpleModel{
    private String username;
    private String password;
    private String role;
    private boolean enabled;
}
