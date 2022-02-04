package com.SmallChange.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String out = "=========零钱通明细表如下：========";
    double money = 0;
    double moneyin = 0;
    double moneyout = 0;
    String note = "";
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");

    public void detail() {
        System.out.println("1.零钱通明细");
        System.out.println(out);
    }

    public void income() {
        System.out.print("2.请输入您的收益:");
        moneyin = scanner.nextDouble();
        if (moneyin <= 0) {//找不正确的条件
            System.out.println("您输入的金额有误");
            return;
        }
        money += moneyin;
        out += "\n" + sdf.format(date) + "     收入" + moneyin + "元" + "    账户余额:" + money;
    }

    public void usage() {
        System.out.println("3.请输入您的消费金额");
        moneyout = scanner.nextDouble();
        System.out.println("请输入您的消费内容");
        note = scanner.next();
        if (moneyout <= 0) {//找不正确的条件
            System.out.println("您输入的金额有误");
            return;
        }
        money -= moneyout;
        out += "\n" + note + "   " + sdf.format(date) + "     收入" + moneyout + "元" + "    账户余额:" + money;
    }

    public void exit() {
        System.out.println("4.退出");

        while (true) {
            System.out.println("你确定要退出吗？y/n");
            String choice = scanner.next();
            if (choice.equals("y")) {
                loop = false;
                break;
            }
            if (choice.equals("n")) {
                loop = true;
                break;
            }
        }

    }

    public void menu() {
        do {
            System.out.println("-----------零钱通-----------");
            System.out.println("--------1. 零钱通明细--------");
            System.out.println("--------2. 收益入账----------");
            System.out.println("--------3. 消费-------------");
            System.out.println("--------4. 退出-------------");
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.usage();
                    break;
                case "4":
                    this.exit();
                    break;
            }
        } while (loop);
    }

}
