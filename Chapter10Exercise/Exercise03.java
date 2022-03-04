package com.Exercise;

/**
 * @author Bixlku
 * @version 1.0
 */
public class Exercise03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.shout();
        dog.shout();
    }
}

abstract class Animal{
    abstract void shout();
}

class Cat extends Animal {
    public void shout(){
        System.out.println("喵");
    }
}

class Dog extends Animal{

    @Override
    void shout() {
        System.out.println("汪");
    }
}