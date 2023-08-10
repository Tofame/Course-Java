package com.example.basics.data.types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J03_furtherIntoBasics {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World.");
        // Prosty test inputu usera oraz użycie tego input'u jako indexu w tablicy imion.
        String strArray[] = {"Ola", "Kasia", "Karol", "Basia"};

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
        System.out.println("Podaj numer: (Maksymalny numer to: " + (strArray.length - 1) + ")");
        String strNum = reader.readLine();
        int index = Integer.parseInt(strNum);

        System.out.println("Wybrane imie: " + strArray[index]);
    }
}