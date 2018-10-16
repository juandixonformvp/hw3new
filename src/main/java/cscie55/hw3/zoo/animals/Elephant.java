package cscie55.hw3.zoo.animals;

import cscie55.hw3.zoo.iface.Speakable;

import java.util.*;

public class Elephant extends Animal implements Speakable {

    public Elephant() {
    }

    public Elephant(String name, int age, boolean male, ArrayList<String> favoriteFoods, Diet diet) {
        super(name, age, male, favoriteFoods, diet);
    }

    public Elephant(String name, int age, boolean male) {
        super(name, age, male);
    }

    public Elephant(ArrayList<String> favoriteFoods, Diet diet) {
        super(favoriteFoods, diet);
    }

    @Override
    public String speak(String speak_string){
        StringBuilder speaking = new StringBuilder(speak_string);
        speaking.append(" Trumpet!");
        return speaking.toString();
    }

}
