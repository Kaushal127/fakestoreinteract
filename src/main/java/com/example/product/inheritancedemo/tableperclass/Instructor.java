package com.example.product.inheritancedemo.tableperclass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity(name = "tpc_instructor")
public class Instructor extends User {
    private String specialization;

}
