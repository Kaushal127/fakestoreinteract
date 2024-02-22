package com.example.product.inheritancedemo.mappedsupperclass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public class User {
    @Id
    private Long id ;
    private String name ;
    private String email ;
    private String password ;
}
