package com.example.product.inheritancedemo.mappedsupperclass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity(name = "ms_instructor")
public class Instructor extends User {
    private String specialization;

}
