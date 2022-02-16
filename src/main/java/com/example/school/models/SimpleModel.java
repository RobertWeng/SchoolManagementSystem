package com.example.school.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import static javax.persistence.GenerationType.IDENTITY;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class SimpleModel{
    @Id
    @GeneratedValue(strategy = IDENTITY)
    public Integer id;
}
