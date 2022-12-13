package com.example.myapp3.lesson12;

public class Dog extends Pet{
    int height;

    public Dog (String name, String breed, int height) {
        super (name, breed);
        this.height = height;
    }

    @Override
    public void printPets () {
        System.out.println("Dog: " + " " + getName() + ", " + "Breed: " + " " + getBreed() + ", " + "Height: " + this.height);
    }
}
