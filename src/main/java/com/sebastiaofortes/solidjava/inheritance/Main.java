package com.sebastiaofortes.solidjava.inheritance;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe filha
        Dog d = new Dog("Buddy", "Woof", "Golden Retriever");

        // Chamando um método da classe pai através da classe filha
        d.makeSound();

        // Acessando diretamente os campos da classe pai através da classe filha
        System.out.printf("%s is a %s%n", d.name, d.breed);

        Animal a = d;
        System.out.printf("Animal: %s, the sound is %s%n", a.name, a.sound);
    }
}
