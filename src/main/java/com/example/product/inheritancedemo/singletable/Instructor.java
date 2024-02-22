package com.example.product.inheritancedemo.singletable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("2")
public class Instructor extends User {
    private String specialization;

}
