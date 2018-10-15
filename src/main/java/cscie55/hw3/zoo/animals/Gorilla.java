package cscie55.hw3.zoo.animals;

import java.util.*;

public class Gorilla extends Animal {

    public Gorilla() {
    }

    public Gorilla(String name, int age, boolean male, ArrayList<String> favoriteFoods, Diet diet) {
        super(name, age, male, favoriteFoods, diet);
    }

    public Gorilla(String name, int age, boolean male) {
        super(name, age, male);
    }

}
