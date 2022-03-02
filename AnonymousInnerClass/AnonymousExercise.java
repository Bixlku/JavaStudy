package com.InnerClass;

public class AnonymousExercise {
    public static void main(String[] args) {
        //使用匿名内部类，当作实参传递，简洁高效，不需要为调用一次的内容新写一个类
        f1(new IL(){
            public void show(){
                System.out.println("匿名内部类，实现show方法");
            }
        });

        //传统方法
        f1(new Picture());
    }

    //静态方法，形参是接口类型
    public static void f1(IL il) {
        il.show();
    }
}

interface IL{
    void show();
}

//类->实现IL =>编程领域（硬编码）
class Picture implements IL{
    @Override
    public void show() {
        System.out.println("传统方法实现show方法");
    }
}