package com.example.product.inheritancedemo.mappedsupperclass;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.Entity;

@Getter
@Setter
@Entity(name = "ms_mentor")
public class Mentor extends User {
    private String company ;
    private Float avgRating ;
}
