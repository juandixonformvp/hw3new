package cscie55.hw3.elevator;

/**
 * A <code>Passenger</code> object represents a person to ride the Elevator.
 * a passengers has a ID number, knows its current Floor and its destination Floor.
 *

 */

public class Passenger {
    private int currentFloor;
    private int destinationFloor;

    public Passenger(int id) {

    }

    public int getCurrentFloor() {
        return this.currentFloor;

    }

    public int getDestinationFloor() {
        return this.destinationFloor;

    }

    public void waitForElevator(int newDestinationFloor) {

    }

    public void boardElevator() {

    }

    public void arrive() {

    }

    public String toString(){
        return "Floor: "+getCurrentFloor()+" Destination: "+getDestinationFloor();
    }
}