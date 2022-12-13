package com.example.myapp3.lesson12;

public class Cat extends Pet{
    int age;

    public Cat (String name, String breed, int age) {
        super (name, breed);
        this.age = age;
    }

    @Override
    public void printPets () {
        System.out.println("Cat: " + " " + getName() + ", " + "Breed: " + " " + getBreed() + ", " + "Age: " + this.age);
    }
}
