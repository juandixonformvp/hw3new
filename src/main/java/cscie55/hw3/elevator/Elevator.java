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


        if (this.currentFloor == 1) {
            Set<Passenger> tempBoarders = new HashSet<>();
            tempBoarders = myBuilding.getFloor(this.currentFloor).getUpwardBound();
            Iterator<Passenger> it = tempBoarders.iterator();
            while (it.hasNext()) {
                Passenger p = it.next();
                myBuilding.getFloor(p.getDestinationFloor()).goInElevator(p, p.getDestinationFloor());
            }
            tempBoarders.clear();
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

        if (this.currentFloor != 1) {

            Set<Passenger> tempBoarders = new HashSet<>();
            if (this.goingUp()) {
                tempBoarders = myBuilding.getFloor(this.currentFloor).getUpwardBound();
            } else {
                tempBoarders = myBuilding.getFloor(this.currentFloor).getDownwardBound();
            }
            Iterator<Passenger> itb = tempBoarders.iterator();
            while (itb.hasNext()) {
                Passenger p = itb.next();
                myBuilding.getFloor(p.getDestinationFloor()).goInElevator(p, p.getDestinationFloor());
            }
            tempBoarders.clear();

        }




//
//
//
//        if (!tempBoarders.isEmpty()) {
//                Iterator<Passenger> it = tempBoarders.iterator();
//                while (it.hasNext()) {
//                    try {
//                        Passenger p = it.next();
//                        myBuilding.getFloor(this.currentFloor).goInElevator(p, p.getDestinationFloor());
//                        this.addToCount(p.getDestinationFloor()); //keeps a count of how many people are in elevator, by destination floor
//                    } catch (ElevatorFullException e) {
//                        break;
//                    }
//                }
//
//            }




    }




    /**
     * The "boardPassenger" method adds to the Elevator one passenger destined for the indicated floor.
     *
     */



    public void addToCount(int destinationFloorNumber) throws ElevatorFullException {
        if(this.countPassengers() >= CAPACITY) {
            throw new ElevatorFullException("Elevator is at full capacity. Please wait for the elevator to return.");
        }
        else {
            myBuilding.getFloor(destinationFloorNumber).setNumPass();
        }
    }

    /**
     * The "getPassengers" method returns the total number of persons currently in the elevator.
     *
     */
    public int countPassengers() {
        int tempSum = 0;
        for (Floor tempFloor : myBuilding.allFloorsArray) {
            tempSum = tempSum + tempFloor.getNumPass();
        }
        return tempSum;
    }

    public Set<Passenger> getPassengers() {
        Set<Passenger> mergedSet = new HashSet<Passenger>();
        for (Floor tempFloor : myBuilding.allFloorsArray) {
            mergedSet.addAll(tempFloor.getInElevator());
        }
        return mergedSet;
    }

//    public Set<Passenger> getPassengers() {
//        Set<Passenger> mergedSet = new HashSet<Passenger>();
//        for (Floor tempFloor : myBuilding.allFloorsArray) {
//            mergedSet.addAll(tempFloor.getUpwardBound());
//            mergedSet.addAll(tempFloor.getDownwardBound());
//        }
//        Iterator<Passenger> it = mergedSet.iterator();
//        while(it.hasNext()){
//            Passenger p = it.next();
//            if (p.getCurrentFloor() != -1) {
//                it.remove();
//            }
//        }
//        return mergedSet;
//    }

//    public String toString(){
//        return "Floor: "+getCurrentFloor()+" Dir: "+getDirectionUp()+" NumPass: "+getPassengers();
//
//    }

}