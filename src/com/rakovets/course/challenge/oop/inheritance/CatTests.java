package com.rakovets.course.challenge.oop.inheritance;

public class CatTests {
    public static void main(String[] args) {
        Person mark = new Person(50);

        Cat barsic = new Cat("Boris");
        barsic.displayInfo();
        barsic.mew();
        barsic.setName("Kita");
        barsic.getName();
        barsic.displayInfo();
        barsic.purr();

        Siamese siamese = new Siamese("Kaska");
        siamese.displayInfo();
        siamese.purr();
        siamese.mew();

        Persian persian = new Persian("Kaluma");
        persian.displayInfo();
        persian.purr();
        persian.mew();

        Sphynx sphynx = new Sphynx("Dimka");
        sphynx.displayInfo();
        sphynx.purr();
        sphynx.mew();

        barsic.mew(mark);
        mark.displayInfo();
        barsic.purr(mark);
        barsic.purr(mark);
        mark.displayInfo();

        siamese.mew(mark);
        mark.displayInfo();
        siamese.purr(mark);
        mark.displayInfo();
        siamese.purr();
        mark.displayInfo();


        mark.displayInfo();
        persian.mew(mark);
        mark.displayInfo();
        persian.purr();
        mark.displayInfo();
        persian.purr(mark);
        mark.displayInfo();


        for (int i = 0; i < 5; i++) {
            sphynx.mew(mark);
        }
        mark.displayInfo();

        for (int i = 0; i < 10; i++) {
            sphynx.purr(mark);
        }
        mark.displayInfo();

    }
}



