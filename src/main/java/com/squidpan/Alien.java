package com.squidpan;

public class Alien {

    private int age;

    public Alien() {
        System.out.println(" Alien object created");
    }
    public void code() {
        System.out.println("Alien coding");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println(" Alien setter");
        this.age = age;
    }
}
