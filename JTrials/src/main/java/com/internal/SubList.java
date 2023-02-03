package com.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Amit on 12/3/2018.
 */
public class SubList {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Tiger",10));
        animals.add(new Animal("Lion",20));
        animals.add(new Animal("Giraffe",30));
        animals.add(new Animal("Wolf",40));

        List<String> animalNames = animals.stream()
                .map(animal -> animal.getName())
                .collect(Collectors.toList());

        Map<String, String> modifiedAnimals = animals.stream()
                .collect(Collectors.toMap(animal -> animal.getName(),
                        animal -> String.valueOf(animal.getWeight())));



        System.out.println(animalNames);
    }

}

class Animal{
    private String name;
    private int weight;

    public Animal(String animalName, int weight){
        this.name=animalName;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
