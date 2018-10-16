package cscie55.hw3.zoo.animals;

import cscie55.hw3.zoo.iface.Trainable;

import java.util.*;

public class Gorilla extends Animal implements Trainable {

    public Gorilla() {
    }

    public Gorilla(String name, int age, boolean male, ArrayList<String> favoriteFoods, Diet diet) {
        super(name, age, male, favoriteFoods, diet);
    }

    public Gorilla(String name, int age, boolean male) {
        super(name, age, male);
    }

    @Override
    public String train(String train_string){
        StringBuilder training = new StringBuilder(train_string);
        return training.toString();
    }

}
