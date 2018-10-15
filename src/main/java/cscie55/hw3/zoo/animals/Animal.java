package cscie55.hw3.zoo.animals;

import java.util.*;
import cscie55.hw3.zoo.iface.Eatable;
import cscie55.hw3.zoo.iface.Playable;
import cscie55.hw3.zoo.iface.Speakable;

public abstract class Animal implements Eatable, Speakable, Playable {

    private String name;
    private int age;
    private boolean male;
    private ArrayList<String> favoriteFoods = new ArrayList<String>();
    public enum Diet { VEGGIE, MEAT, OMNI };
    Diet diet;


    public Animal() {
        this.name = "Buddy";
        this.age = 0;
        this.male = true;
        this.favoriteFoods.add("water");
        this.diet = Diet.VEGGIE;
    }

    public Animal(String name, int age, boolean male, ArrayList<String> favoriteFoods, Diet diet) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.favoriteFoods = favoriteFoods;
        this.diet = diet;
    }

    public Animal(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.favoriteFoods.add("water");
        this.diet = Diet.VEGGIE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public ArrayList<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(ArrayList<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    @Override
    public String eat(){
        StringBuilder eating = new StringBuilder();
        eating.append("Delightfully tasty ");
        for(int i = 0; i < favoriteFoods.size(); i++) {
            eating.append(favoriteFoods.get(i));
            eating.append(i < favoriteFoods.size() - 1 ? ", " : ".");
        }
        return eating.toString();
    }

    @Override
    public String speak(String speak_string){
        StringBuilder speaking = new StringBuilder(speak_string);
        return speaking.toString();
    }

    @Override
    public String play(String play_string){
        StringBuilder playing = new StringBuilder(play_string);
        return playing.toString();
    }

    public String toString(){
        return getClass().getName()+"[name="+this.name+",age="+this.age+",male="+this.male+",favfood="+this.favoriteFoods.get(0)+",diet="+this.diet+"]";
    }


}
