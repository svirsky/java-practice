package com.rakovets.java.practice.collections;
import javax.swing.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        Person person = new Person(507, "Wasya", "Pupkin");
        map.put(person.getPhonenumber(), person);
        person = new Person(280, "Tolya", "Gazanov");
        map.put(person.getPhonenumber(), person);
        person = new Person(781, "Serega", "Sotin");
        map.put(person.getPhonenumber(), person);
        person = new Person(274, "Kalyan", "Brutal");
        map.put(person.getPhonenumber(), person);
        person = new Person(298, "Genka", "Obrygan");
        map.put(person.getPhonenumber(), person);
        person = new Person(228, "Volodya", "Rjaviy");
        map.put(person.getPhonenumber(), person);
        person = new Person(811, "Nikita", "Chirilo");
        map.put(person.getPhonenumber(), person);
        person = new Person(733, "Leha", "Subotta");
        map.put(person.getPhonenumber(), person);
        person = new Person(488, "Misha", "Balinski");
        for (Map.Entry<Integer, Person> item : map.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
    }
}