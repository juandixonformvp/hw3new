package cscie55.hw3.zoo.animals;

import java.util.*;

public class Panda extends Animal {

    public Panda() {
    }

    public Panda(String name, int age, boolean male, ArrayList<String> favoriteFoods, Diet diet) {
        super(name, age, male, favoriteFoods, diet);
    }

    public Panda(String name, int age, boolean male) {
        super(name, age, male);
    }

}
