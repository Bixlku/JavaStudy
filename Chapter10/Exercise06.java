package com.Exercise;

/**
 * @author Bixlku
 * @version 1.0
 */
public class Exercise06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧", Factory.getHorse());
        person.passRiver();
        person.passRoad();
    }
}

interface IVehicles {
    public void work();
}

class Horse implements IVehicles {

    @Override
    public void work() {
        System.out.println("horse work");
    }
}

class Boat implements IVehicles {

    @Override
    public void work() {
        System.out.println("boat work");
    }
}


class Person {
    private String name;
    private IVehicles vechicles;

    public Person(String name, IVehicles vechicles) {
        this.name = name;
        this.vechicles = vechicles;
    }

    public void passRiver() {
        if (!(vechicles instanceof Boat)) {//有利于避免null
            vechicles = Factory.getBoat();
        }
        vechicles.work();
    }

    public void passRoad() {
        if (!(vechicles instanceof Horse)) {//有利于避免null
            vechicles = Factory.getHorse();
        }
        vechicles.work();
    }
}

class Factory {

    private static Horse horse=new Horse();//饿汉式

    public static Boat getBoat() {
        return new Boat();
    }

    public static Horse getHorse() {
        return horse;
    }

    private Factory(){}
}