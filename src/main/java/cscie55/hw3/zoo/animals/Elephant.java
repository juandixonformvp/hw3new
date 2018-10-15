package cscie55.hw3.zoo.animals;

import java.util.*;

public class Elephant extends Animal {

    public Elephant() {
    }

    public Elephant(String name, int age, boolean male, ArrayList<String> favoriteFoods, Diet diet) {
        super(name, age, male, favoriteFoods, diet);
    }

    public Elephant(String name, int age, boolean male) {
        super(name, age, male);
    }

}
