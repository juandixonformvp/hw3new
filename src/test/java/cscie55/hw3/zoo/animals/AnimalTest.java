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

        // Testing constructors, no argument and overloaded
        Animal myLion = new Lion();
        Animal myGorilla = new Gorilla();
        Animal myPolarBear = new PolarBear();
        Animal myElephant = new Elephant();
        Animal myPanda = new Panda();
        System.out.println(" ");
        System.out.println("Testing no argument constructors");
        System.out.println(myLion.toString());
        System.out.println(myGorilla.toString());
        System.out.println(myPolarBear.toString());
        System.out.println(myElephant.toString());
        System.out.println(myPanda.toString());
        System.out.println(" ");

        Animal lion2 = new Lion("Liono",12, false);
        ArrayList<String> lionFoods = new ArrayList<String>();
        lionFoods.add("beef");
        Animal lion3 = new Lion("King",8, true, lionFoods, Animal.Diet.MEAT);
        System.out.println("Testing Lion overloaded constructors");
        System.out.println(lion2.toString());
        System.out.println(lion3.toString());
        System.out.println(" ");
    }

    @Test
    public void animalEat() {

        //testing Eatable interface, using overloaded constructor
        ArrayList<String> lionFoods = new ArrayList<String>();
        lionFoods.add("beef");
        lionFoods.add("chicken");
        lionFoods.add("pork");

        ArrayList<String> gorillaFoods = new ArrayList<String>();
        gorillaFoods.add("bananas");
        gorillaFoods.add("yams");
        gorillaFoods.add("leaves");

        ArrayList<String> pbFoods = new ArrayList<String>();
        pbFoods.add("fish");
        pbFoods.add("seal");
        pbFoods.add("walrus");

        ArrayList<String> elephantFoods = new ArrayList<String>();
        elephantFoods.add("peanuts");
        elephantFoods.add("hay");
        elephantFoods.add("cornmeal");

        ArrayList<String> pandaFoods = new ArrayList<String>();
        pandaFoods.add("bamboo");
        pandaFoods.add("apples");
        pandaFoods.add("pears");

        Animal eatLion = new Lion(lionFoods, Animal.Diet.MEAT);
        Animal eatPolarBear = new PolarBear(pbFoods, Animal.Diet.MEAT);
        Animal eatGorilla = new Gorilla(gorillaFoods, Animal.Diet.VEGGIE);
        Animal eatElephant = new Elephant(elephantFoods, Animal.Diet.VEGGIE);
        Animal eatPanda = new Panda(pandaFoods, Animal.Diet.VEGGIE);

        System.out.println("Testing Eatable Interface with Overloaded Constructor");
        System.out.println(eatLion.eat());
        System.out.println(eatGorilla.eat());
        System.out.println(eatPolarBear.eat());
        System.out.println(eatElephant.eat());
        System.out.println(eatPanda.eat());
        System.out.println(" ");
    }

    @Test
    public void animalSpeak() {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Lion());
        animalList.add(new Gorilla());
        animalList.add(new PolarBear());
        animalList.add(new Elephant());
        animalList.add(new Panda());

        //Polymorphism in action. Method speak() executes
        //differently for each of the five different types of animals
        System.out.println("Testing polymorphism, speak() executes differently for each animal");
        System.out.println(" ");
        for (Animal myAnimal : animalList) {
            System.out.println(myAnimal.speak("I'm speaking-"));
        }
        System.out.println(" ");
    }

}
