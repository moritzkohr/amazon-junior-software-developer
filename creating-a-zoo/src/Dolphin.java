public class Dolphin extends Animal implements Eat, Swim{

    private String colorOfDolphin;
    private double swimmingSpeed;

    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood(){
        System.out.println("Dolphin: I am eating delicious fish");
    }
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void swimming(){
        System.out.println("Dolhin: I am swimming at the speed of " + swimmingSpeed+ " nautical miles per hour");
    }
}
