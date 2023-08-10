package com.example.basics.data.types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J02_arrays_strings_prints {
    public static void main(String[] args) throws IOException {
        byte small = -127;
        short numShort = 32000;
        int number = 12345;
        long big = 234234234L;
        final int numberTwo = 352095;
        String s1 = "Słówko pierwsze, a nastepnie ";
        String s2 = new String("słówko drugie, string stworzony z konstruktorem.");
        s2 = s1 + s2;
        System.out.println("Tekst:" + s2);

        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Input logic, disabled for now.
        //System.out.println("Podaj swoje imię:");
        //String name = reader.readLine();
        //System.out.println("Twoje imię to: " + name);

        int array[]; // deklaracja tablicy o nazwie array
        array = new int[8]; // alokacja pamięci na 8 elementów typu int
        System.out.println("Wartość 2-iego elementu: " + array[2]); // zawsze 0 domyślnie

        long numArr[] = new long[5];
        System.out.println("Ss");

        int arrayik[] = { 3, 26, 99 };
        System.out.println("Second element of arrayik:" + arrayik[2]); // 99 (because indexing starts at 0)

        int numArray[] = new int[10];
        numArray[1] = 7;
        System.out.println("=======\n=======\nnumArray presentation \u263A \nnumArray[1]: " + numArray[1] + "\t\tnumArray.length: " + numArray.length);
    }
}