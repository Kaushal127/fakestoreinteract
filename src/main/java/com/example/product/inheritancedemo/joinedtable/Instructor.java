package com.example.product.inheritancedemo.joinedtable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Getter
@Setter
@Entity(name = "jt_instructor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Instructor extends User{
    private String specialization;

}
