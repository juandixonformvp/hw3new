package cscie55.hw3.zoo.animals;

import java.util.*;

public abstract class Animal {

    private String name;
    private int age;
    private boolean male;
    ArrayList<String> favoriteFoods = new ArrayList<String>();
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


}
