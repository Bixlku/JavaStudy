package com.Exercise;

/**
 * @author Bixlku
 * @version 1.0
 */
public class Exercise04 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.testWork(new Calculate() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,9);
    }
}

interface Calculate{
    public double work(double n1,double n2);
}

class Phone {
    public void testWork(Calculate calculate,double n1,double n2){
        double result = calculate.work(n1,n2);
        System.out.println(result);
    }
}