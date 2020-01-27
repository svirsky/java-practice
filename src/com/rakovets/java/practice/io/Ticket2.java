package com.rakovets.java.practice.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Ticket2 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("wasap.txt.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());
            int fi = -1;
            String fileContent = "";
            while ((fi = fin.read())!= -1) {
                fileContent += (char) fi;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}