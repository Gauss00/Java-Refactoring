package Refact.car;

public class Sedan extends Car{
    public Sedan(int numberOfPassengers) {
        super(SEDAN, numberOfPassengers);
    }

    public int getMaxSpeed() {
        final int MAX_SEDAN_SPEED = 120;
        return MAX_SEDAN_SPEED;
    }
}
