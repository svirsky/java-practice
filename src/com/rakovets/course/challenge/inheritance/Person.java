package com.rakovets.course.challenge.inheritance;

public class Person {
    private Integer happiness;
    Person(Integer happiness) {
        this.happiness = happiness;
    }
    public Integer getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
    public void takeHappiness (int happiness) {
        this.happiness = this.happiness + happiness;
        if (this.happiness > 0 && happiness <99) {
            System.out.println("People is Happy!");
        }
            else if(this.happiness <0) {

            System.out.println("People is Dipression! :(");
            }
            else {
            System.out.println("People is Dzen");
        }
    }
}