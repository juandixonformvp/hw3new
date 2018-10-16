package cscie55.hw3.zoo.animals;

import cscie55.hw3.zoo.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.HashSet;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.*;

public class AnimalTest {
    @Test
    public void animalPrint() {

        Animal lion1 = new Lion();
        Animal lion2 = new Lion("Liono",12, false);
        ArrayList<String> lionFoods = new ArrayList<String>();
        lionFoods.add("beef");
        Animal lion3 = new Lion("King",8, true, lionFoods, Animal.Diet.MEAT);
        System.out.println(lion1.toString());
        System.out.println(lion2.toString());
        System.out.println(lion3.toString());
    }

}
