package com.example.basics.data.operators;

import java.io.IOException;

public class J01_Introduction_Operators {
    public static void main(String[] args) throws IOException {
        int a, b, c;

        int i1 = 3 + 5; // 8
        int i2 = 10 / 4; // 2
        int rest = 12 % 8; // reszta z dzielenia, 4
        int value = 10 - 2 * 2; // 6

        a = 10;
        c = b = a + 5;
        System.out.println("A: " + a + " B: " + b + " C: " + c);


        int g = 12;
        int h = 22;
        int o = g + h++; 
        System.out.println("o: " + o); // 34
        System.out.println("h: " + h); // 23, a wyżej przecież 34 = 12 + 22, ponieważ inkrementacja PO działaniu
        // jeżeli chcielibyśmy o 35, a h 23, to robimy: o = g + ++h;


    }
}