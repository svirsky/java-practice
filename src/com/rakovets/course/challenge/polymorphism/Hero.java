package com.rakovets.course.challenge.polymorphism;

public class Hero {
    private String name;
    Hero(String name) {
        this.name = name;
    }
    public void attackEnemy() {
        System.out.println("Hero attacked Enemy!");
    }
}