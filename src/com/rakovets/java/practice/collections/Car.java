package com.rakovets.java.practice.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Car {
    private String marka;
    private String color;

    Car(String marka, String color){
        this.marka = marka;
        this.color = color;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}