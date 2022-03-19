package Elevator;
import java.util.Random;

public class Apartment {
    private int ApartmentFloor = 10;
    Random random3 = new Random();
    int result3 = random3.nextInt(10)+1;
    private int YourFloor = result3;
    
    public int getYourFloor() {
        return YourFloor;
    }
    public int getApartmentFloor() {
        return ApartmentFloor;
    }
}
