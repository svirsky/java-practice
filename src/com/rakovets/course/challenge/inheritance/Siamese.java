package com.rakovets.course.challenge.inheritance;

public class Siamese extends Cat {
    Siamese(String name) {
        super(name);
    }
    public void mew(Person person) {
        System.out.println("Myaw! Myaw! Myaw!");
        person.takeHappiness(-30);
    }
    public void purr(Person person) {
        System.out.println("Rrr... Rrr... Rrr...");
        person.takeHappiness(30);
    }
}