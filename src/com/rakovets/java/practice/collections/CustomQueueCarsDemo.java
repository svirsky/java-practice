package com.rakovets.java.practice.collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CustomQueueCarsDemo {
    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        cars.add(new Car("BMW", "black"));
        cars.add(new Car("Audi", "gray"));
        cars.add(new Car("Renault", "cream"));
        cars.add(new Car("Mercedes", "white"));
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        cars.get(2);
    }
}