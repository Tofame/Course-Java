package com.example.basics.data.types;

import java.io.IOException;
import java.math.*; // * means we want all of the math classes

public class J07_BigVariableTypes {
    public static void main(String[] args) throws IOException {
        // When e.g. a variable value will exceed the max value of for example "long"
        BigInteger bigInt = new BigInteger("502395230592030529509");
        bigInt = bigInt.add(new BigInteger("325353530930591000000"));
        System.out.println("Wynik: " + bigInt);
        
        BigDecimal decimal = new BigDecimal("12093509");
        decimal = decimal.pow(6);
        System.out.println("Wartość zmiennej decimal: " + decimal.toString());
    }
}