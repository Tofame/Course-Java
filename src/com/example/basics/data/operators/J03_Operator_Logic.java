package com.example.basics.data.operators;

import java.io.IOException;

public class J03_Operator_Logic {
    public static void main(String[] args) throws IOException {
        System.out.println( (10 > 4 && (12 == 12)) ); // both are true, so the result is true too
        System.out.println(10 > 4 && 3 > 12 ); // false, because first is true second is false
        // Czyli '&&' jest jak 'and'
        System.out.println(25 > 24 || 2 < 3); // true, because one of them is true
        System.out.println(5 == 4 || 23 > 2); // true, because one of them is true
        // Czyli '||' jest jak 'or'

    }
}