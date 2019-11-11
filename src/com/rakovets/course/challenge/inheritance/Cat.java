package com.rakovets.course.challenge.inheritance;

public class Cat {
    private String name;

    Cat(String name) {
       this.name = name;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public void mew(Person person){
        System.out.println("Mew! Mew! Mew!");
        person.takeHappiness(-20);
    }

    public void purr(Person person){
        System.out.println("Hrr... Hrr... Hrr...");
        person.takeHappiness(20);
    }
}