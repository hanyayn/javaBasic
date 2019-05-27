package com.neuedu.test;

import java.util.Scanner;

public class ZiiMu {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner input = new Scanner(System.in);
        String b= input.next();
        char a= b.charAt(0);
        if (a>='a'&&a<='z'){
            a-=32;
            System.out.println("输出："+a);
        }else System.out.println("输出："+b);

    }
}
