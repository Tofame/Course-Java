package com.example.basics.data.types;

import java.io.IOException;

public class J08_Konwersja_Jawna_Niejawna {
    public static void main(String[] args) throws IOException {
        int i = 3;
        double a = 10.0d;
        // Jawna konwersja
        double b = a / (double)i;

        System.out.println(b); // 3.333333333333

        // Niejawna konwersja, byłaby gdy: double b = a / i; <- wtedy program java automatycznie wybiera ogólny typ.
        // Przykład poniżej
        int c = 4;
        double d = 10.0d * c;
        System.out.println(d); // 40.0

        // Czasem jest to prawie, że wymagane, przykład poniżej
        double d2 = 5.5;
        int num = 10 * (int)d2; // bez konwersji d2 na int tutaj, Java wyświetliłaby nam ostrzeżenie.
        // Otrzymamy w konsoli 50, czyli przy konwersji d2 na int straciliśmy ułamek, konwersja zamieniła 5.5 na 5.
        System.out.println(num);
    }
}