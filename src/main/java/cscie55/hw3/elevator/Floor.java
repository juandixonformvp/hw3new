package cscie55.hw3.elevator;


/**
 * A <code>Floor</code> object represents a getFloor in a building.
 * Each Floor object has a Floor number and tracks how many people
 * are waiting for the Elevator.
 *
 */

//import java.util.stream.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Floor {

//    public int isWaitingArray[] = new int[Building.FLOORS];
    public int numPass;
    public int myFloorNumber;
    private Set<Passenger> residents = new LinkedHashSet<>();
    private Set<Passenger> upwardBound = new LinkedHashSet<>();
    private Set<Passenger> downwardBound = new LinkedHashSet<>();
    private Set<Passenger> inElevator = new LinkedHashSet<>();

    /** Initializes the current floor, and direction.
     * Class variables description -
     * Number of passengers on the floor.
     * The Floor number (cannot be zero).
     * An array for tracking the number of people waiting on the floor.
     */
    public Floor(Building building, int floorNumber) {
        this.numPass = 0;
        this.myFloorNumber = floorNumber + 1; // add 1 because it is initialized by an index to an array
    }

    protected void setNumPass() {
        this.numPass++;
    }

    protected void clearNumPass() {
        this.numPass = 0;
    }

    protected int getNumPass() {
        return this.numPass;
    }

    protected int getFloorNumber() {
        return this.myFloorNumber;
    }

    protected Set<Passenger> getUpwardBound() {
        return this.upwardBound;
    }

    protected Set<Passenger> getDownwardBound() {
        return this.downwardBound;
    }

    protected Set<Passenger> getResidents() {
        return this.residents;
    }

    protected Set<Passenger> getInElevator() {
        return this.inElevator;
    }

    /**
     * This method basically "summons" the elevator.
     * Increments the isWaitingArray.
     *
     */

    public void waitForElevator(Passenger passenger, int destinationFloor) {
        if (destinationFloor > this.myFloorNumber) {
            passenger.waitForElevator(destinationFloor);
            this.upwardBound.add(passenger);
            this.residents.remove(passenger);

        }
        if (destinationFloor < this.myFloorNumber) {
            passenger.waitForElevator(destinationFloor);
            this.downwardBound.add(passenger);
            this.residents.remove(passenger);
        }
    }


    public void goInElevator(Passenger passenger, int destinationFloor) {
        passenger.boardElevator();
        this.inElevator.add(passenger);
    }


    public void enterGroundFloor(Passenger passenger) {
        this.residents.add(passenger);
    }

    public boolean isResident(Passenger passenger) {
        if(this.residents.contains(passenger)) {
            return true;
        } else {
            return false;
        }
    }

}