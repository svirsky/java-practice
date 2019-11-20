package com.rakovets.course.challenge.oop.inheritance;

public class PersonTests {
    public static void main(String[] args) {
        Person mark = new Person (25.5);
        mark.displayInfo();
        System.out.println("Добавляем счастья 30.5 пунктов");
        mark.takeHappiness(30.5);
        mark.displayInfo();
        System.out.println("Добавляем печали 100 пунктов");
        mark.takeHappiness(-100.0);
        mark.displayInfo();
        System.out.println("Устанавливаем новый уровень СУПЕР счастья в 1000 пунктов");
        mark.setHappiness(1000);
        mark.displayInfo();
    }
}
