package com.rakovets.course.challenge.inheritance;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }
    public void mew(Person person) {
        System.out.println("May! May! May!");
        person.takeHappiness(-15);
    }
    public void purr(Person person) {
        System.out.println("Frr... Frr... Frr...");
        person.takeHappiness(15);
    }
}