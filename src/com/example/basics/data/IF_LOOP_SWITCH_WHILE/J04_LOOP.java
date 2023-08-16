package com.example.basics.data.IF_LOOP_SWITCH_WHILE;

public class J04_LOOP {
    public static void main(String[] args) {
        String names[] = { "Adam", "Janek", "Ryszard", "Józef", "Marian", "Ferdek", "Helena", "Halina" };

        for (int a = 0; a < names.length; a++) {
            String str = names[a];
            System.out.println("Osoba " + (a + 1) + " ma na imię " + str + "."); // a + 1, ponieważ nie chcemy, aby pisało "Osoba 0" (indexowanie zaczyna się od 0).
        }

        // for (int i = names.length - 1; i >= 0; i--) {
        //     System.out.println("Imię: " + names[i]);
        // }

        System.out.println("Zawodnicy drużyny pierwszej: ");
        for (int b = 0; b < names.length; b = b + 2) {
            System.out.println(names[b]);
        }
        System.out.println("Zawodnicy drużyny drugiej: ");
        for (int c = 1; c < names.length; c = c + 2) {
            System.out.println(names[c]);
        }
    }
}