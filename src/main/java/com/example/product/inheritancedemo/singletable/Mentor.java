package com.example.product.inheritancedemo.singletable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("1")
public class Mentor extends User {
    private String company ;
    private Float avgRating ;
}
