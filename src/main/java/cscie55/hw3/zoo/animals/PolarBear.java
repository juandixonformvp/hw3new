package cscie55.hw3.zoo.animals;

import java.util.*;

public class PolarBear extends Animal {

    public PolarBear() {
    }

    public PolarBear(String name, int age, boolean male, ArrayList<String> favoriteFoods, Diet diet) {
        super(name, age, male, favoriteFoods, diet);
    }

    public PolarBear(String name, int age, boolean male) {
        super(name, age, male);
    }

}