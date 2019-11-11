package com.rakovets.course.challenge.inheritance;

public class Home {
    public static void main(String[] args) {
        Person tom = new Person(100);
        Cat cat = new Cat("Boris");
        cat.purr(tom);
        Siamese siam = new Siamese("Jora");
        siam.purr(tom);
        Sphynx sphynx = new Sphynx("Gucci");
        sphynx.purr(tom);
    }
}