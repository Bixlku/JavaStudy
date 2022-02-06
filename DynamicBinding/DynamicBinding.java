package com.poly;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());//40->30
        System.out.println(a.sum1());//30->20

    }
}
