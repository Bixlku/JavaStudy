package com.InnerClass;

public class AnonymousExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //1.传递的是实现了Bell接口的匿名内部类
        //2.重写了ring
        //3.即    Bell bell = new Bell() {
        //            @Override
        //            public void ring() {
        //                System.out.println("懒猪起床了");
        //            }
        //        }
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }

}

interface Bell{
    void ring();

}

class Cellphone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}

