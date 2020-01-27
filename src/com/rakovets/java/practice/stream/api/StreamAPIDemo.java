package com.rakovets.java.practice.stream.api;
import java.util.stream.IntStream;
public class StreamAPIDemo {

        public static void main(String[] args) {
            long count = IntStream.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21,
                    23, 25, 27, 29, 31, 33, 35)
                    .filter(w -> w % 5 == 0)
                    .count();
            System.out.println(count);
        }
    }