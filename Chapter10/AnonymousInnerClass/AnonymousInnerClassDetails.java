package com.InnerClass;

public class AnonymousInnerClassDetails {
    public static void main(String[] args) {

    }
}

class Oter05 {
    private int n1 = 99;

    public void f1() {
        Person p = new Person() {
            public void hi() {
                //默认遵循就近原则，如果想访问外部类的成员，则可以使用（`外部类名.this.成员`）去访问
                System.out.println("重写了Person的hi方法");
            }
        };
        p.hi();
        //也可以直接调用，匿名内部类本身也是返回对象
        new Person() {
            public void hi() {

                System.out.println("重写了Person的hi方法");
            }
        }.hi();
    }
}

class Person {//类

    public void hi() {
        System.out.println("Person hi()");
    }
}
//抽象类/接口