package Refact.car;

public class Truck extends Car{


    public Truck(int numberOfPassengers) {
        super(TRUCK, numberOfPassengers);
    }

    public int getMaxSpeed() {
        final int MAX_TRUCK_SPEED = 80;
        return MAX_TRUCK_SPEED;
    }
}
