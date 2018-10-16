package cscie55.hw3.zoo.animals;

import cscie55.hw3.zoo.iface.Speakable;

import java.util.*;

public class PolarBear extends Animal implements Speakable {

    public PolarBear() {
    }

    public PolarBear(String name, int age, boolean male, ArrayList<String> favoriteFoods, Diet diet) {
        super(name, age, male, favoriteFoods, diet);
    }

    public PolarBear(String name, int age, boolean male) {
        super(name, age, male);
    }

    public PolarBear(ArrayList<String> favoriteFoods, Diet diet) {
        super(favoriteFoods, diet);
    }

    @Override
    public String speak(String speak_string){
        StringBuilder speaking = new StringBuilder(speak_string);
        speaking.append(" Growl!");
        return speaking.toString();
    }

}
