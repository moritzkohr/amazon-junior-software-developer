package main;

import java.util.Scanner;

// Beginning of the main class. The name of the main class and the file should be same.
public class Main {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int subChoice;
        int dayOfTheWeek = 1;

        System.out.println("********** MENU *****************");
        System.out.println("These are the choices for week of the day. \\n Please enter only values from 1-7:");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("3. WEDNESDAY");
        System.out.println("4. THURSDAY");
        System.out.println("5. FRIDAY");
        System.out.println("6. SATURDAY");
        System.out.println("7. SUNDAY");
        System.out.println("***********************************");

        System.out.println();
        dayOfTheWeek = keyboard.nextInt();

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");
                System.out.println("*********** SUB MENU FOR MONDAY ******");
                System.out.println("1. Yes, I had my breakfast");
                System.out.println("2. No, I would like one");
                System.out.println("**************************************");
                subChoice = keyboard.nextInt();
                if (subChoice == 1) {
                    System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");
                }
                else if (subChoice == 2) {
                    System.out.println("Let us divert on Highway 54 and have a Burger on the drive in");
                }
                else{
                    System.out.println("NO such choice available");
                }
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }


    } //end of main method

} //end of the main class
