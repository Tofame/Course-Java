package com.example.basics.data.IF_LOOP_SWITCH;

public class J03_SWITCH {
    public static void main(String[] args) {
        // Bonus do if'a, czyli operator trój elementowy. Jeśli wartość jest true, to info będzie "parzysta", a jeśli nie, to co po dwukropku -> "nieparzysta"
        int number = 12;
        String info = (number % 2 == 0) ? "parzysta" : "nieparzysta";
        System.out.println(info + "\n"); // parzysta

        // Switches
        // It is said that switch might be faster than its' if-else variant.
        int num = 7;
        switch (num) {
            case 3:
                System.out.println("Numer jest równy 3.");
                break;
            case 7:
                System.out.println("Number jest równy 7.");
                break;
            default:
                System.out.println("Domyślny kod tutaj...");
        }

        int monthNum = 10;
        String season = "";

        switch (monthNum) {
            case 3:
            case 4:
            case 5:
                season = "Wiosna";
                break;
            case 6:
            case 7:
            case 8:
                season = "Lato";
                break;
            case 9:
            case 10:
            case 11:
                season = "Jesień";
                break;
            case 12:
            case 1:
            case 2:
                season = "Zima";
                break;
            default:
                season = "Brak informacji o porze roku.";
        }

        System.out.println("Numer miesiąca " + monthNum + " to pora roku: " + season);
    }
}