package com.example.myapp3.lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnimalHandling {

    static Map<String, Pet> pets = new HashMap<>();

    public static void main(String[] args) {
        Pet barsik = new Cat ("Barsik", "Bengal", 3);
        Pet murka = new Cat ("Murka", "Abyssinian", 5);
        Pet muhtar = new Dog ("Muhtar", "Alaskan", 50);
        Pet reks = new Dog ("Reks", "Akita", 80);
        Pet pegas = new Horse ("Pegas", "Lusitano", 400);
        pets.put(barsik.getName(), barsik);
        pets.put(murka.getName(), murka);
        pets.put(muhtar.getName(), muhtar);
        pets.put(reks.getName(), reks);
        pets.put(pegas.getName(), pegas);

        printPets();
        deletePets();
    }

    static void printPets () {
        for(Pet pet: pets.values()) {
            pet.printPets();
        }
    }

    private static void deletePets () {
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя животного, которое нужно удалить");
            String name = in.nextLine();
            if(!pets.containsKey(name)) {
                System.out.println("Некорректный ввод. Повторите операцию");
            } else {
                pets.remove(name);
                printPets();
                break;
            }
        } while (true);
    }
}
