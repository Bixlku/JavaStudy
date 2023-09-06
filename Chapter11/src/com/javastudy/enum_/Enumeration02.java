package com.javastudy.enum_;

/**
 * @author Bixlku
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);

    }
}

enum Season1 {

    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","萧瑟"),
    WINTER("冬天","寒冷");

    private String name1;
    private String desc;

    private Season1(String name1, String desc) {
        this.name1 = name1;
        this.desc = desc;
    }

    private String getName() {
        return name1;
    }

    private String getDesc() {
        return desc;
    }


}