package Refact.car;

public class Cabriolet extends Car {
    public Cabriolet(int numberOfPassengers) {
        super (CABRIOLET, numberOfPassengers);
    }

    public int getMaxSpeed() {
        final int MAX_CABRIOLET_SPEED = 90;
        return MAX_CABRIOLET_SPEED;
    }
}
