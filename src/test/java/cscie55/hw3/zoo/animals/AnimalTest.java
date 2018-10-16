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

    @Test
    public void animalEat() {

        ArrayList<String> pbFoods = new ArrayList<String>();
        pbFoods.add("fish");
        pbFoods.add("seal");
        pbFoods.add("walrus");

        ArrayList<String> gorillaFoods = new ArrayList<String>();
        gorillaFoods.add("bananas");
        gorillaFoods.add("yams");
        gorillaFoods.add("leaves");

        Animal eatPolarBear = new PolarBear(pbFoods, Animal.Diet.MEAT);
        Animal eatGorilla = new Gorilla(gorillaFoods, Animal.Diet.VEGGIE);

        System.out.println(eatPolarBear.eat());
        System.out.println(eatGorilla.eat());
    }

    @Test
    public void animalEat() {

        ArrayList<String> pbFoods = new ArrayList<String>();
        pbFoods.add("fish");
        pbFoods.add("seal");
        pbFoods.add("walrus");

        ArrayList<String> gorillaFoods = new ArrayList<String>();
        gorillaFoods.add("bananas");
        gorillaFoods.add("yams");
        gorillaFoods.add("leaves");

        Animal eatPolarBear = new PolarBear(pbFoods, Animal.Diet.MEAT);
        Animal eatGorilla = new Gorilla(gorillaFoods, Animal.Diet.VEGGIE);

        System.out.println(eatPolarBear.eat());
        System.out.println(eatGorilla.eat());
    }

}
