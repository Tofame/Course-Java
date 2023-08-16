package com.example.basics.data.IF_LOOP_SWITCH_WHILE;

import java.util.Random;

public class J05_WHILE {
    public static void main(String[] args) {
       int i = 5;

       while (i > 0) {
        System.out.println(i);
        i--;
       }

       i = 1;

       while (i <= 8) {
        System.out.println("Liczymy do 8, jesteśmy na " + i);
        i++;
       }

       i = 20;
       Random rand = new Random();

       do {
        int randomMultiplier = rand.nextInt(30);
        System.out.println(i * randomMultiplier);
        System.out.println("(Teraz i jest równe: " + i + ", które zostało przemnożone przez " + randomMultiplier + ")");
        i--;
       } while (i > 0);

    }
}