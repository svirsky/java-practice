package com.rakovets.course.challenge.polymorphism;

public class Archer extends Hero {
    Archer(String name) {
        super(name);
    }
    public void attackEnemy() {
        System.out.println("Hero attacked Enemy!");
    }
}