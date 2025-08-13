package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car myFirstCar = new Car();
        myFirstCar.make="Toyota";
        myFirstCar.model="Corolla";
        myFirstCar.color="Black";
        myFirstCar.year=2019;

        System.out.println(myFirstCar.getCarDetails());
        myFirstCar.getCarDetails();
        Car[] cars = new Car[5];
        Scanner scanner = new Scanner(System.in);
        for( int i =0; i<5;i++){
            cars[i] = new Car();
            System.out.println("Enter details for Car "+(i+1)+":");
            System.out.println("Make: ");
            cars[i].make=scanner.nextLine();
            System.out.println("Model: ");
            cars[i].model=scanner.nextLine();
            System.out.println("Color: ");
            cars[i].color=scanner.nextLine();
            System.out.println("Year: ");
            cars[i].year=scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Your Car Collection:");
        for (Car car : cars) {
            String CarDetails = car.getCarDetails();
            System.out.println(CarDetails);
        }
    }
}
