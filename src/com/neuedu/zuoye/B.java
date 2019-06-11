package com.neuedu.zuoye;
import java.util.Scanner;

public class B {
    public static Pizza getPizza(int gain) {
            Scanner input = new Scanner(System.in);
            Pizza p = null;
            if (gain == 1) { // 培根披萨
                System.out.println("请输入培根克数:");
                int gramNum = input.nextInt();
                System.out.println("请输入披萨价格:");
                int price = input.nextInt();
                System.out.println("请输入披萨大小:");
                int size = input.nextInt();
                p = new BaconPicca("培根披萨", price, size, gramNum);
            }
            if (gain == 2) { // 海鲜披萨
                System.out.println("请输入配料信息:");
                String category = input.next();
                System.out.println("请输入披萨价格:");
                int price = input.nextInt();
                System.out.println("请输入披萨大小:");
                int size = input.nextInt();
                p = new A("海鲜披萨",price,size,category);
            }
            return p;
        }
    }


