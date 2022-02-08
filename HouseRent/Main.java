package com.HouseRent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HouseApp houseApp = new HouseApp();
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----------房屋出租系统-----------");
            System.out.println("--------1. 新增房源--------");
            System.out.println("--------2. 查找房源----------");
            System.out.println("--------3. 删除房屋-------------");
            System.out.println("--------4. 修改房屋信息-------------");
            System.out.println("--------5. 房屋列表-------------");
            System.out.println("--------6. 退出-------------");
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    houseApp.add();
                    break;
                case "2":
                    houseApp.search();
                    break;
                case "3":
                    houseApp.del();
                    break;
                case "4":
                    houseApp.change();
                    break;
                case "5":
                    houseApp.list();
                    break;
                case "6":
                    loop = false;
                    break;
            }
        } while (loop);

    }
}
