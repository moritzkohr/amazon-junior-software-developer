package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isEngineOn = true;
        String gear = "P";
        int speed = 0;
        int choice = 0;

        do {
            System.out.println("------ Car Dashboard ------");
            System.out.println("Engine On: " + isEngineOn);
            System.out.println("Gear: " + gear);
            System.out.println("Speed: " + speed);

            System.out.println("Menu:");
            System.out.println("1. Turn on/off the engine");
            System.out.println("2. Change gear (P, D, R)");
            System.out.println("3. Accelerate");
            System.out.println("4. Brake");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    isEngineOn = !isEngineOn;
                    break;
                case 2:
                    System.out.println("Enter gear (P, D, R): ");
                    gear = scanner.next();
                    break;
                case 3:
                    if (isEngineOn && !gear.equals("P")) {
                        speed += 10;
                    } else {
                        System.out.println("Cannot accelerate while engine is off or in Park (P) gear.");
                    }
                    break;
                case 4:
                    if (isEngineOn && !gear.equals("P")) {
                        speed -= 10;
                    } else {
                        System.out.println("Cannot brake while engine is off or in Park (P) gear.");
                    }
                    break;
                case 5:
                    System.out.println("Exit application");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 5);


    }
}
