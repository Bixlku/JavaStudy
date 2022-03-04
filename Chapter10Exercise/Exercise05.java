package com.Exercise;

/**
 * @author Bixlku
 * @version 1.0
 */
public class Exercise05 {

    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}

class A {
    private String name = "Aname";

    public void m1() {
        class B {
            private String name = "Bname";

            public void show() {
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}