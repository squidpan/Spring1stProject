package com.squidpan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Alien {

    @Value("21")
    private int age;
    //private Laptop lap = new Laptop();

//    @Autowired -- better to do it above setter below
//    @Qualifier("laptop")
//    @Qualifier("desktop")
    private Computer com;
    private int salary;

    public Alien() {
        System.out.println("Alien Object Created");
    }

//    @ConstructorProperties({"age","lap"})
//    public Alien(int age,Computer com) {
//        System.out.println("Para Constructor Called");
//        this.age = age;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {    // Setter Injection
        System.out.println("Setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }

}