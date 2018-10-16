package cscie55.hw3.elevator;

/**
 * A <code>Elevator</code> object represents an Elevator in
 * a building. 
 *
 * @author
 */

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Elevator {

    public static final int CAPACITY = 10;
    private int currentFloor;
    private boolean directionUp;
    private Building myBuilding;

    /** Initializes the current floor, and direction.
     * Class variables description -
     * A field for tracking the Elevator's current floor.
     * A field for tracking the Elevator's direction of travel.
     * A field for tracking the Building instance.
     */
    public Elevator(Building building) {
        this.currentFloor = 1;
        this.directionUp = true;
        this.myBuilding = building;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    public boolean getDirectionUp() {
        return this.directionUp;
    }

    public boolean goingUp() {
        if (this.directionUp) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean goingDown() {
        if (!this.directionUp) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * The "move" method increments/decrements the current floor.
     * Modifies the direction of travel, if the ground floor or top floor has been reached.
     * Clears the array entry tracking the number of passengers destined for the floor.
     * Checks to see if there are passengers waiting on the current floor and boards them.
     * Prints out the status of the Elevator.
     *
     */
    public void move() {

        // Next block of code is unchanged from HW1, basic move functionality
        if (currentFloor == 1) {
            this.directionUp = true;
        }

        if (currentFloor == Building.FLOORS) {
            this.directionUp = false;
        }

        if (directionUp == true) {
            this.currentFloor++;
        } else {
            this.currentFloor--;
        }



        if (!this.getPassengers().isEmpty()) {

            Iterator<Passenger> it = this.getPassengers().iterator();
            while (it.hasNext()) {
                Passenger p = it.next();
                if (p.getDestinationFloor() == this.currentFloor) {
                    myBuilding.getFloor(this.currentFloor).getInElevator().remove(p);
                    p.arrive();
                    myBuilding.getFloor(this.currentFloor).enterGroundFloor(p);
                }
            }
        }


        Set<Passenger> tempBoarders = new HashSet<>();
        if (this.goingUp() || this.currentFloor == 1) {
            tempBoarders = myBuilding.getFloor(this.currentFloor).getUpwardBound();
        } else {
            tempBoarders = myBuilding.getFloor(this.currentFloor).getDownwardBound();
        }
        Iterator<Passenger> itb = tempBoarders.iterator();
        while (itb.hasNext()) {
            Passenger p = itb.next();
            try {
                boardPassenger(p);
                itb.remove();
            }
            catch(ElevatorFullException e) {
                break;
            }
        }

    }


    /**
     * The "getPassengers" method returns the total number of persons currently in the elevator.
     *
     */

    public Set<Passenger> getPassengers() {
        Set<Passenger> mergedSet = new HashSet<Passenger>();
        for (Floor tempFloor : myBuilding.allFloorsArray) {
            mergedSet.addAll(tempFloor.getInElevator());
        }
        return mergedSet;
    }

    /**
     * The "boardPassenger" method adds to the Elevator one passenger destined for the indicated floor.
     *
     */

    public void boardPassenger(Passenger p) throws ElevatorFullException {
        if(this.getPassengers().size() >= CAPACITY) {
            throw new ElevatorFullException("Elevator is at full capacity. Please wait for the elevator to return.");
        }
        else {
            this.myBuilding.getFloor(p.getDestinationFloor()).goInElevator(p, p.getDestinationFloor());
        }
    }

    public String toString(){
        return "Floor: "+getCurrentFloor()+" Dir: "+getDirectionUp();
    }

}