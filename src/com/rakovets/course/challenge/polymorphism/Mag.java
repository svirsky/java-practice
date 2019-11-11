package com.rakovets.course.challenge.polymorphism;

public class Mag extends Hero {
    Mag(String name) {
        super(name);
    }
    public void attackEnemy() {
        System.out.println("Hero attacked Enemy!");
    }
}