package com.example.myapp3.lesson12;

public class Horse extends Pet{
    int weight;

    public Horse (String name, String breed, int weight) {
        super (name, breed);
        this.weight = weight;
    }

    @Override
    public void printPets () {
        System.out.println("Horse: " + " " + getName() + ", " + "Breed: " + " " + getBreed() + ", " + "Weight: " + this.weight);
    }
}
