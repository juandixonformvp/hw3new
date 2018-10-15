package cscie55.hw3.zoo.animals;

import java.util.*;

public class Lion extends Animal {

    public Lion() {
    }

    public Lion(String name, int age, boolean male, ArrayList<String> favoriteFoods, Diet diet) {
        super(name, age, male, favoriteFoods, diet);
    }

    public Lion(String name, int age, boolean male) {
        super(name, age, male);
    }
}
