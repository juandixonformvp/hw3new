package cscie55.hw3.zoo.animals;

import cscie55.hw3.zoo.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.HashSet;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalTest {
    @Test
    public void animalPrint() {

        Animal lion1 = new Lion();
        Animal lion2 = new Lion("liono",12, false);
        System.out.println(lion1.toString());
        System.out.println(lion2.toString());
    }

}
