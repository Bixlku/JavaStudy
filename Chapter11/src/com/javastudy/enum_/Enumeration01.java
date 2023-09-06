package com.javastudy.enum_;

/**
 * @author Bixlku
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN.toString());
    }
}

class Season{
    private String name;
    private String desc;

    final public static Season SPRING= new Season("春天","温暖");
    final public static Season SUMMER= new Season("夏天","炎热");
    final public static Season AUTUMN= new Season("秋天","萧瑟");
    final public static Season WINTER= new Season("冬天","寒冷");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    private String getName() {
        return name;
    }

    private String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}