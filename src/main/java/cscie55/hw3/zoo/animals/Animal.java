package cscie55.hw3.zoo.animals;

import java.util.*;

public abstract class Animal {
    private String name;
    private int age;
    private boolean male;
    ArrayList<String> favoriteFoods = new ArrayList<String>();
    public enum Diet { VEGGIE, MEAT, OMNI };
    Diet diet;
}
