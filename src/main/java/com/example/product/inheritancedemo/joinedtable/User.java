package com.example.product.inheritancedemo.joinedtable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity (name = "jt_user")
public class User {
    @Id
    private Long id ;
    private String name ;
    private String email ;
    private String password ;
}
