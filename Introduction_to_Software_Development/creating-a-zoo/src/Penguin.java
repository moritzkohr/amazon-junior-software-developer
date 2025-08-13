public class Penguin extends Animal implements Eat, Walk, Swim {
    private boolean isSwimming;
    private double walkSpeed, swimSpeed;

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public double getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood(){
        System.out.println("Penguin: I am eating delicious fish");
    }
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }


    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed of " + swimSpeed+" nautical miles per hour");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed of " + walkSpeed+" mph");
    }
}
