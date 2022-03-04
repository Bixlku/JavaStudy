package com.Exercise;

/**
 * @author Bixlku
 * @version 1.0
 */
public class Execise02 {

}

class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum() {
        currentNum = currentNum + 100;
        return currentNum;
    }
}

class TestFock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber() + "\n" + frock1.getSerialNumber() + "\n" + frock2.getSerialNumber());

    }
}
