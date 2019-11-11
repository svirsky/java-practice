package com.rakovets.course.challenge.inheritance;

public class Sphynx extends Cat{
    Sphynx(String name) {
        super(name);
    }
    public  void mew(Person person) {
        System.out.println("Mewww! Mewww! Mewww!");
        person.takeHappiness(-10);
    }
    public void purr(Person person) {
        System.out.println("Mrr... Mrr... Mrr...");
        person.takeHappiness(10);
    }
}