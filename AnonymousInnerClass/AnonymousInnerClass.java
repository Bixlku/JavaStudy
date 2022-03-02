package com.InnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        //1.需求：想使用IA接口，并创建对象
        //2.传统方式：写一个类，实现该接口，并创建对象
        //3.需求是Tiger只用一次，后面不再使用
        Tiger tiger = new Tiger();
        tiger.cry();
        //演示基于接口的匿名内部类
        //4.可以使用匿名内部类来简化开发
        //5.tiger的编译类型？IA
        //6.tiger的运行类型？就是匿名内部类 XXXXX => AnonymousInnerClass$1
        /*
            底层会 分配 类名 AnonymousInnerClass$1
            class AnonymousInnerClass$1 implements IA{
                @Override
                public void cry() {
                    System.out.println("老虎叫");
                }
            }
         */
        //7.jdk底层在创建匿名内部类AnonymousInnerClass$1，立即创建了AnonymousInnerClass$1实例，并且把地址返回给tiger
        //8.匿名内部类 使用一次就不能在使用了，但是对象还在
        IA tiger2 = new IA() {
            @Override
            public void cry() {
            }
        };//本质是一个语句，所以后面的分号不能少
        System.out.println("tiger的类名：" + tiger2.getClass());

        //演示基于类的匿名内部类
        //分析
        //1.dog编译类型： Dog
        //2.dog运行类型： AnonymousInnerClass$2
        //3.底层会创建匿名内部类（和上面那个差不多）
        //4.同时也返回了匿名内部类AnonymousInnerClass$2的对象
        //5.参数列表会自动传递给构造器
        Dog dog = new Dog("Jack") {
            @Override
            public void cry() {
                System.out.println("重写了dog的cry方法");
            }
        };
        System.out.println("dog的类名：" + dog.getClass());
        dog.cry();

        //基于抽象类的匿名内部类
        //这里的就必须重写方法，因为此时编译类型Animal是个抽象类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("吃东西");
            }
        };
    }
}

interface IA {
    public void cry();
}

class Tiger implements IA {
    @Override
    public void cry() {
        System.out.println("老虎叫");
    }
}

class Dog {
    String name;

    public void cry() {
        System.out.println("狗叫");
    }

    public Dog(String name) {
        this.name = name;
    }
}

abstract class Animal {
    abstract void eat();
}