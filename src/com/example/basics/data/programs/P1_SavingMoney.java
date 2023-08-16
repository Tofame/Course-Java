package com.example.basics.data.programs;

import java.util.Scanner;
// Next time instead of Scanner I will be using BufferReader Class
// Reason - Processing Speed
// Scanner is bit slower as it need to parse data as well.

public class P1_SavingMoney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double initialCapital = 0;
        double yearlyInterest = 0;
        int yearsSaving = 0;

        double finalCapital; // rezultat oszczędzania

        System.out.println("Wpisz kapitał początkowy:");
        initialCapital = Double.valueOf(scan.nextLine()).doubleValue();

        System.out.println("Wpisz roczne oprocentowanie (5 to 5%):");
        yearlyInterest = Double.valueOf(scan.nextLine()).doubleValue();

        System.out.println("Wpisz ilość lat oszczędzania:");
        yearsSaving = scan.nextInt();

        finalCapital = initialCapital * Math.pow(1 + (yearlyInterest / 100.0d), yearsSaving);

        System.out.println("Efekt oszczędzania z procentem składowym: " + Math.round(finalCapital));

    }
}