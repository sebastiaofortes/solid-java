package com.sebastiaofortes.solidjava.inheritance;

public class Animal {
    String name;
    String sound;

    // Construtor
    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Método da classe pai
    void makeSound() {
        System.out.printf("%s makes a %s sound%n", name, sound);
    }
}