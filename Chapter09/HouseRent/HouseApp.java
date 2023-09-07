package com.HouseRent;

import java.util.Scanner;

public class HouseApp {

    private int number = -1;
    House[] houses = new House[100];

    public void add() {

        number++;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        System.out.println("------------------添加房屋------------------");
        System.out.print("姓名:");
        String name = scanner.next();

        System.out.print("电话:");
        String phone = scanner.next();

        System.out.print("地址:");
        String address = scanner.next();

        System.out.print("月租:");
        double rentmoney = scanner.nextDouble();

        System.out.print("状态(未出租/已出售):");

        boolean status = true;
        do {
            String housestatus = scanner.next();
            if (housestatus.equals("未出租")) {
                status = true;
                flag = false;
            } else if (housestatus.equals("已出售")) {
                status = false;
                flag = false;
            } else {
                System.out.println("输入有误，请再次输入");
            }
        } while (flag);
        houses[number] = new House(name, phone, address, rentmoney, status);

    }

    public void change() {
        int id_sele;
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------修改客户------------------");
        System.out.println("请选择修改房屋编号(-1退出):");
        id_sele = scanner.nextInt() - 1;
        if (id_sele == -1) {
            return;
        }

        System.out.println("姓名" + "(" + houses[id_sele].getName() + ")");
        houses[id_sele].setName(scanner.next());

        System.out.println("电话" + "(" + houses[id_sele].getName() + ")");
        houses[id_sele].setPhone(scanner.next());

        System.out.println("地址" + "(" + houses[id_sele].getName() + ")");
        houses[id_sele].setAddress(scanner.next());

        System.out.println("租金" + "(" + houses[id_sele].getName() + ")");
        houses[id_sele].setRentmoney(scanner.nextDouble());

        String status;
        if (houses[id_sele].getStatus()) {
            status = "未售出";
        } else {
            status = "已售出";
        }
        System.out.println("状态" + "(" + status + ")");

        boolean flag = true;

        while (true){
            String housestatus = scanner.next();
            if (housestatus.equals("未出租")) {
                houses[number].setStatus(true);
                break;
            }
            if (housestatus.equals("已出售")) {
                houses[number].setStatus(false);
                break;
            }
            System.out.println("输入有误，请再次输入");

        }


    }

    public void search(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------查找房屋------------------");
        System.out.print("输入你要查找的id:");
        int id = scanner.nextInt();
        System.out.println(houses[id-1].toString());
    }

    public void del(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入你要删除的id:");
        int id = scanner.nextInt();
        houses[id-1] = null;
    }

    public void list(){
        System.out.println("-----------房屋列表-----------");
        for(int i =0;i<100;i++){
            if(houses[i]!=null&&houses[i].getId()!=-1){
                System.out.println(houses[i].toString());
            }
        }
    }



}
