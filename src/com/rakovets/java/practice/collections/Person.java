package com.rakovets.java.practice.collections;

public class Person {
    private  Integer phonenumber;
    private String name;
    private String surname;
    Person(int phonenumber, String name, String surname){
        this.phonenumber = phonenumber;
        this.name = name;
        this.surname = surname;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return "Person{" +
                "phonenumber=" + phonenumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}