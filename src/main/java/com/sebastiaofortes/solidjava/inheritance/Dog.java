package com.sebastiaofortes.solidjava.inheritance;

// Definição da classe filha (subclasse)
public class Dog extends Animal {
    String breed;

    // Construtor
    Dog(String name, String sound, String breed) {
        super(name, sound);  // Chama o construtor da classe pai
        this.breed = breed;
    }
}
