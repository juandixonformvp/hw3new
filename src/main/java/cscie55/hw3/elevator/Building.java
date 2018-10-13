package cscie55.hw3.elevator;

/**
 * A <code>Building</code> object represents Building. A building
 * has an Elevator objects as well as a number of FLOORS as defined
 * in a static int. A building knows the state of each Floor object as
 * well as it's Elevator.
 *
 *
 */

//import java.util.stream.*;

public class Building {

    public static final int FLOORS = 7;
    public Elevator myElevator;
    public Floor allFloorsArray[] = new Floor[FLOORS];

    /** Initializes an array of "Floor" instances
     * Class variables description -
     * A constant, (i.e., a static final field), for the number of floors in the building.
     * An Elevator instance
     * An array that contains "Floor" instances
     */
    public Building() {
        this.myElevator = new Elevator(this);
        for (int i = 0; i < FLOORS; i++) {
            allFloorsArray[i] = new Floor(this, i); // note that floor can be zero
        }
    }

    public Floor getFloor(int floorNumber) {
        return this.allFloorsArray[floorNumber - 1];
    }

    public Elevator getElevator() {
        return this.myElevator;
    }

    public void enter(Passenger passenger) {
        this.getFloor(1).enterGroundFloor(passenger);
    }

}
