package com.rakovets.course.challenge.oop.inheritance;

public class Home {
    public static void main(String[] args) {
        Person person = new Person(9);
        Cat cat = new Siamese("Lola");
        Cat cat1 = new Sphynx("Maksim");
        cat1.purr(person);
        cat1.mew(person);
    }
}
