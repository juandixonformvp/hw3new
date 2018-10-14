package cscie55.hw3.elevator;

/**
 * A <code>Passenger</code> object represents a person to ride the Elevator.
 * a passengers has a ID number, knows its current Floor and its destination Floor.
 *

 */

public class Passenger {
    private int currentFloor;
    private int destinationFloor;
    private int id;

    public Passenger(int id) {
        this.id = id;
        this.currentFloor = 1;
        this.destinationFloor = -1;
    }

    public int getCurrentFloor() {
        return this.currentFloor;

    }

    public int getDestinationFloor() {
        return this.destinationFloor;

    }

    public void waitForElevator(int newDestinationFloor) {
        this.destinationFloor = newDestinationFloor;
    }

    public void boardElevator() {
        this.currentFloor = -1;
    }

    public void arrive() {
        this.currentFloor = this.destinationFloor;
        this.destinationFloor = -1;
    }

    public String toString(){
        return "Floor: "+getCurrentFloor()+" Destination: "+getDestinationFloor();
    }
}