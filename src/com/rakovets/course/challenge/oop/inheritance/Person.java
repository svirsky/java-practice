package com.rakovets.course.challenge.oop.inheritance;

/**### Specification of task 3
 Создать класс `Person`.

 Поля:
 - `happiness` количество счастья у человека (в процентах)

 Конструкторы:
 - `Person(happiness)` принимает количество счастья

 Методы:
 - `takeHappiness(happiness)` получение/возвращение счастья (зависит от того какое число: полож./отриц.)
 - `getHappiness()` получить количество счастья
 - `setHappiness(happiness)` задать количество счастья
 */

public class Person {
    private String name;

    private double happiness;

    Person(double happiness) {
        this.happiness = happiness;
    }

    public void takeHappiness(double happiness) {
        this.happiness += happiness;
        minMaxLevelHappiness();
    }

    public double minMaxLevelHappiness() {
        if (this.happiness > 100) {
            this.happiness = 100;
        } else if (this.happiness < 0) {
            this.happiness = 0;
        }
        return this.happiness;
    }

    public double getHappiness() {
        minMaxLevelHappiness();
        return this.happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
        minMaxLevelHappiness();
    }

    void displayInfo() {
        System.out.printf("Level of Happines is %f points now.\n", happiness);
    }
}
