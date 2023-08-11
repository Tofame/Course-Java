package com.example.basics.data.IF_LOOP_SWITCH;

import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;

public class J01_IF_Statement {
    enum Weather { Rainy, Sunny, Cloudy, Storm };

    public static int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static void main(String[] args) {
        // int number = 4;
        // if (number > 5) 
        // {
        //     System.out.println("Liczba jest większa od 5.");
        // } else if (number == 4) {
        //     System.out.println("Liczba jest równa 4.");
        // } else {
        //     System.out.println("Liczba jest mniejsza od 5.");
        // }

        int age = 21;
        int weight = 50;

        int requiredAge = 18;
        int requiredWeight = 75;

        // Możemy to zrobić z &&, ale chciałem zrobić to w ten sposób.
        if (age >= requiredAge) {
            if (weight >= requiredWeight) {
                System.out.println("Kandydat się kwalifikuje.");
            } else {
                System.out.println("Kandydat się nie kwalifikuje - Wymóg zarówno wagi jak i wieku nie jest spełniony");
            }
        } else {
            System.out.println("Wymóg wieku nie jest spełniony");
        }

        System.out.println("================= \n================= \n=================");

        Weather[] weatherValues = Weather.values();
        // First method of randomly choosing weather
        Random randomnumber = new Random();
        Weather actualWeather = weatherValues[randomnumber.nextInt(weatherValues.length)]; // random from 0 to lenght

        // Second method of randomly choosing weather (better in my opinion)
        int randomValue = random(0, (weatherValues.length - 1)); // because indexing starts at 0 and lenght will show 4 when its 0,1,2,3
        actualWeather = weatherValues[randomValue];

        boolean hasUmbrella = false;
        System.out.println("Current weather is: " + actualWeather);
        System.out.println("Do you have an umbrella: " + hasUmbrella);
        System.out.println("You try to go outside..");

        if ((actualWeather == Weather.Rainy || actualWeather == Weather.Storm)) {
            if (hasUmbrella == true) {
                System.out.println("You made a correct choice going out with an umbrella.");
            } else {
                System.out.println("It's too rainy for you to go without an umbrella!");
            }
        } else {
            if (hasUmbrella == true && actualWeather != Weather.Cloudy) {
                System.out.println("You can leave your umbrella at home. The weather is good");
            } else { //if (hasUmbrella == false && actualWeather == "Cloudy") {
                System.out.println("You might need an umbrella in case it started raining!");
            }
        }
    }
}