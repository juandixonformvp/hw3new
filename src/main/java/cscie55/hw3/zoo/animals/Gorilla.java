package cscie55.hw3.zoo.animals;

import cscie55.hw3.zoo.iface.Speakable;

import java.util.*;

public class Gorilla extends Animal implements Speakable {

    public Gorilla() {
    }

    public Gorilla(String name, int age, boolean male, ArrayList<String> favoriteFoods, Diet diet) {
        super(name, age, male, favoriteFoods, diet);
    }

    public Gorilla(String name, int age, boolean male) {
        super(name, age, male);
    }

    public Gorilla(ArrayList<String> favoriteFoods, Diet diet) {
        super(favoriteFoods, diet);
    }

    @Override
    public String speak(String speak_string){
        StringBuilder speaking = new StringBuilder(speak_string);
        speaking.append(" Chest Thump!");
        return speaking.toString();
    }

}
