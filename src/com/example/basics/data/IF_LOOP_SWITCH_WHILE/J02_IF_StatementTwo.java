package com.example.basics.data.IF_LOOP_SWITCH_WHILE;

import java.util.concurrent.ThreadLocalRandom;

public class J02_IF_StatementTwo {
    public static int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public static void main(String[] args) {
        // Driving license test
        // Required points to pass: pointsToPass
        int points = 0;
        int pointsToPass = 70;
        boolean driverDrunk = false;
        int controlOverCar = random(0, 40);
        int parkingSkills = random(5, 30);
        int eyesight = random(0, 20);
        int calmnessWhileDriving = random(0, 35);
        int cameDrunkToTest = random(1, 10);

        if (cameDrunkToTest >= 9) { // 20% chance for you being drunk
            driverDrunk = true;
            points = -1000;
            System.out.println("You came drunk to your test! You have failed your exam for driver's license!");
        } else {
            points = controlOverCar + parkingSkills + eyesight + calmnessWhileDriving;
            System.out.println("Points for control over car: " + controlOverCar + "\nPoints for parking skills: " + parkingSkills + "\nPoints for eyesight: " + eyesight + "\nPoints for calmness while driving: " + calmnessWhileDriving);
            System.out.println("Your total points are: " + points);
        }

        if (points >= pointsToPass) {
            System.out.printf("Congratulations! You have passed the driving exam with " + Math.abs(points - pointsToPass) + " points over the required amount.");
        } else if (driverDrunk == false) {
            System.out.printf("You have failed the exam. You lacked " + Math.abs(points - pointsToPass) + " points.");
        }
    }
}