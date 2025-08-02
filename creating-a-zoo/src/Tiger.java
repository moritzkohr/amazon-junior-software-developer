public class Tiger extends Animal implements Eat, Walk{

    private int numberOfStripes;
    private double speed;
    private int soundLevelOfRoar;

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public double getSpeed() {
        return speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed "+speed+"mph");
    }
}
