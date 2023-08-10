package com.example.basics.data.types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J04_tablice_wymiarowe {
    public static void main(String[] args) throws IOException {
        // Tablice wymiarowe
        String multiStrArr[][] = { {"one", "two", "three"}, {"cztery", "pięć", "sześć"}, {"seven", "eight", "nine"} };
        System.out.println(" multiStrArr[0][1]: " + multiStrArr[0][1]); // two
    }
}