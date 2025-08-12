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


        Tiger tigerObject = new Tiger();
        tigerObject.setNameOfAnimal("Tiger");


        Dolphin dolphinObject = new Dolphin();
        dolphinObject.setNameOfAnimal("Dolphin");

        Penguin penguinObject = new Penguin();
        penguinObject.setNameOfAnimal("Penguin");

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



