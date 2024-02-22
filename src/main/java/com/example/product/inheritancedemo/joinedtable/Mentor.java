package com.example.product.inheritancedemo.joinedtable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Getter
@Setter
@Entity(name = "jt_mentor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User{
    private String company ;
    private Float avgRating ;
}
