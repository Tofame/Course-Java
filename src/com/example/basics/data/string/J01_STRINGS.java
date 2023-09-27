package com.example.basics.data.string;

public class J01_STRINGS {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = new String("String passed to constructor");
        // Repeats test 5 times in the string
        String s3 = "test ".repeat(5);
        System.out.println(s3);
        // We create a string that has elements connected with delimiter (,)
        String s4 = String.join(",", "1", "2", "3", "4", "5");
        System.out.println(s4);

        // Concat
        String txt1 = "Dodge Charger ";
        int year = 2020;

        String car = txt1 + year;
        System.out.println(car);

        String car2 = txt1.concat( Integer.toString(year) );
        System.out.println(car2);

        // Create a table with 4 names and connect them with concat().
        String names[] = {"Janek", "Karol", "Bartek", "Zuzia"};
        String str = "";

        for (String s : names) {
            str = str.concat(s);
            str += " ";
        }
        System.out.println(str);
    }
}