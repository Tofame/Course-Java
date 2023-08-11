package com.example.basics.data.types;

import java.io.IOException;

public class J09_BMI_Challenge {
    public static void main(String[] args) throws IOException {
        double weight = 70d;
        float height = 1.75f;

        // bmi = masa / (wzrost * wzrost || wzrost^2)

        float bmi = (float)(weight / Math.pow(height, 2));
        System.out.println("BMI wynosi: " + bmi);

        int bmiConverted = (int) bmi;
        System.out.println("Uproszczone BMI: " + bmiConverted);
    }
}