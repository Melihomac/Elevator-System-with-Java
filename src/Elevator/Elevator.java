package Elevator;
import java.util.Random;

public class Elevator {
    Apartment A = new Apartment();
    private boolean IsBusy;
    private int MaxFloor = 10;
    private int MinFloor = 0;
    Random random2 = new Random();
    int result2 = random2.nextInt(10);
    private int CurrentFloor = result2;

    public boolean Busy() {
        Random random = new Random();
        IsBusy= random.nextBoolean();
        if(IsBusy) {
            System.out.println("Sorry Elevator is Busy");
            IsBusy = true;
        }
        else {
            System.out.println("You can use Elevator");
            IsBusy = false;
        }
        return false;
    }
    public String Question() {
        System.out.println("Now Elevator is Floor " + CurrentFloor);
        System.out.println("Now You are Floor " + A.getYourFloor());
        while (CurrentFloor != A.getApartmentFloor() && IsBusy == false){
            if (IsBusy == false && CurrentFloor<A.getYourFloor()) {
                    System.out.println("Elevator is coming Up to your Floor !!!");
                    CurrentFloor = A.getYourFloor();
                    System.out.println("Now Elevator is Floor " + CurrentFloor + " And you are Floor " + A.getYourFloor() + " too");
            } else if (IsBusy == false && CurrentFloor>A.getYourFloor()) {
                    System.out.println("Elevator is coming Down to your Floor !!!");
                    CurrentFloor = A.getYourFloor();
                    System.out.println("Now Elevator is Floor " + CurrentFloor + " And you are Floor " + A.getYourFloor() + " too");
            }
            CurrentFloor = A.getApartmentFloor();
        }
        while (CurrentFloor != MinFloor && IsBusy == false) {
                if (IsBusy == false) {
                    System.out.println("You are going to Floor 0");
                }
            CurrentFloor = MinFloor;
            System.out.println("Now Elevator is Floor " + CurrentFloor);
            }
        return "Error";
    }
    public int getMaxFloor() {return MaxFloor;}
    public int getMinFloor() {return MinFloor;}
    public int getCurrentFloor() {return CurrentFloor;}
}
