import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        /** TODO 1: extend the class Animal to create a new
         *          land based animal named "Tiger" which extends
         *          Animal.
         *          Extra properties of class "Tiger" are:
         *          1. number of stripes
         *          2. speed
         *          3. sound level of roar
         *
         **/
        Tiger tigerObject = new Tiger();
        tigerObject.setNameOfAnimal("Tiger");

        /** TODO 2: extend the class Animal to create a new
         *          water based animal named "Dolphin" which
         *          extends Animal
         *          Extra properties of class "Dolphin" include:
         *          1. color of dolphin
         *          2. swimming speed
         *
         **/
        Dolphin dolphinObject = new Dolphin();
        dolphinObject.setNameOfAnimal("Dolphin");

        Penguin penguinObject = new Penguin();
        penguinObject.setNameOfAnimal("Penguin");


        /** TODO 3: implemement the "Eat" interface in the
         *          "Tiger" class created in the TODO 1
         *          and also in the
         *          "Dolphin" class created in TODO 2.
         **/



        /** TODO 5: implement the "Walk" interface in
         *          "Tiger" class created in the TODO 1
         *          and in the  implementation of the
         *          "walking" method of the interface
         *          display -
         *          " I am walking at the speed "
         *          and join the value of the variable "speed"
         *
         **/

        /** TODO 6: create a new interface named "Swim"
         *          and declaring a method inside it
         *          named "swimming" with the return type
         *          "void"
         **/

        /** TODO 7: implement the "Swim" interface
         *          in the "Dolphin" class and the
         *          "swimming" method in its implementation
         *          should display the swimming speed as
         *          "Dolphin: I am swimming at the speed ...."
         *          where .... is the value of the variable
         *          "swimmingSpeed"
         **/


        /** TODO 8: create a menu system to work with the Animal selected
         *          use the switch provided below
         **/
        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : "+tigerObject.getNameOfAnimal());
                        // get menu choice
                        switch (menuChoice=animalDetailsManipulationMenu(keyboard, tigerObject)) {
                            case 1:
                                System.out.println("Enter age: ");
                                tigerObject.setAge(keyboard.nextInt());
                                System.out.println("Enter height: ");
                                tigerObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight: ");
                                tigerObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter speed: ");
                                tigerObject.setSpeed(keyboard.nextDouble());
                                System.out.println("Enter number of stripes: ");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter sound level of roar: ");
                                tigerObject.setSoundLevelOfRoar(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Age: "+tigerObject.getAge());
                                System.out.println("Height: "+tigerObject.getHeight());
                                System.out.println("Weight: "+tigerObject.getWeight());
                                System.out.println("Speed: "+tigerObject.getSpeed());
                                System.out.println("Number of stripes: "+tigerObject.getNumberOfStripes());
                                System.out.println("Sound level of roar: "+tigerObject.getSoundLevelOfRoar());
                                break;
                            case 3:
                                tigerObject.walking();
                                break;
                            case 4:
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : "+dolphinObject.getNameOfAnimal());
                        // get menu choice
                        switch (menuChoice=animalDetailsManipulationMenu(keyboard, dolphinObject)) {
                            case 1:
                                System.out.println("Enter age: ");
                                dolphinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter height: ");
                                dolphinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight: ");
                                dolphinObject.setWeight(keyboard.nextInt());
                                keyboard.nextLine();
                                System.out.println("Enter color: ");
                                dolphinObject.setColorOfDolphin(keyboard.nextLine());
                                System.out.println("Enter swimming speed: ");
                                dolphinObject.setSwimmingSpeed(keyboard.nextDouble());
                                break;
                            case 2:
                                System.out.println("Age: "+dolphinObject.getAge());
                                System.out.println("Height: "+dolphinObject.getHeight());
                                System.out.println("Weight: "+dolphinObject.getWeight());
                                System.out.println("Color: "+dolphinObject.getColorOfDolphin());
                                System.out.println("Swimming speed: "+dolphinObject.getSwimmingSpeed());
                                break;
                            case 3:
                                dolphinObject.swimming();
                                break;
                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                case 3:
                    do {
                        System.out.println("The animal which is chosen is : "+penguinObject.getNameOfAnimal());
                        // get menu choice
                        switch (menuChoice=animalDetailsManipulationMenu(keyboard, penguinObject)) {
                            case 1:
                                System.out.println("Enter age: ");
                                penguinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter height: ");
                                penguinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight: ");
                                penguinObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter walking speed: ");
                                penguinObject.setWalkSpeed(keyboard.nextDouble());
                                System.out.println("Enter swimming speed: ");
                                penguinObject.setSwimSpeed(keyboard.nextDouble());
                                keyboard.nextLine();
                                System.out.println("Is the penguin swimming (true/false): ");
                                penguinObject.setSwimming(keyboard.nextBoolean());
                                break;
                            case 2:
                                System.out.println("Age: "+penguinObject.getAge());
                                System.out.println("Height: "+penguinObject.getHeight());
                                System.out.println("Weight: "+penguinObject.getWeight());
                                System.out.println("Walking speed: "+penguinObject.getWalkSpeed());
                                System.out.println("Swimming speed: "+penguinObject.getSwimSpeed());
                                System.out.println("Is the pinguin swimming: : "+penguinObject.isSwimming());
                                break;
                            case 3:
                                if(penguinObject.isSwimming()==true){
                                    penguinObject.swimming();
                                }
                                else{
                                    penguinObject.walking();
                                }
                                break;
                            case 4:
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);
        /** TODO 9: create a class "Penguin" from the "Animal" class **/

        /** TODO 10: integrate the choice to pick a "penguin" in the menu system **/

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}



