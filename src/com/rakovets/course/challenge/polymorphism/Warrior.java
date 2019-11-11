package com.rakovets.course.challenge.polymorphism;

public class Warrior extends Hero {
    Warrior(String name) {
        super(name);
    }
    public void attackEnemy() {
        System.out.println("Hero attacked Enemy!");
    }
}