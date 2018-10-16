package cscie55.hw3.zoo.animals;

import cscie55.hw3.zoo.iface.Speakable;

import java.util.*;

public class Lion extends Animal implements Speakable {

    public Lion() {
    }

    public Lion(String name, int age, boolean male, ArrayList<String> favoriteFoods, Diet diet) {
        super(name, age, male, favoriteFoods, diet);
    }

    public Lion(String name, int age, boolean male) {
        super(name, age, male);
    }

    public Lion(ArrayList<String> favoriteFoods, Diet diet) {
        super(favoriteFoods, diet);
    }

    @Override
    public String speak(String speak_string){
        StringBuilder speaking = new StringBuilder(speak_string);
        speaking.append(" Roar!");
        return speaking.toString();
    }
}
