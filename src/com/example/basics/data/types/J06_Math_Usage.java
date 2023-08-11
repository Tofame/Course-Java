package com.example.basics.data.types;

import java.io.IOException;

public class J06_Math_Usage {
    public static void main(String[] args) throws IOException {
        double num = 4.0d;
        double sqrt = Math.sqrt(num); // pierwiastek z num (z 4)

        double power = Math.pow(num, 3); // num (4) podniesione do potęgi 3
        System.out.println("4 podniesione do potęgi 3: " + power); // 4^3 = 64

        double minNumber = Math.min(num, power);
        System.out.println(minNumber);
    }
}