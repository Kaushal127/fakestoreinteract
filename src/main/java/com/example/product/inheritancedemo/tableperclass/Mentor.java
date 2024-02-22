package com.example.product.inheritancedemo.tableperclass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity(name = "tpc_mentor")
public class Mentor extends User{
    private String company ;
    private Float avgRating ;
}
