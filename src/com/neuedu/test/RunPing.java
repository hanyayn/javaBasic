package com.neuedu.test;

import java.util.Scanner;

public class RunPing {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");

        Scanner input=new Scanner(System.in);//控制台能输入字
        int year=input.nextInt();//控制台能输入字


       if(year%4==0&&year%100!=0){
            System.out.println("闰年");

        }else if(year%400==0){
           System.out.println("闰年");
       } else {
           System.out.println("平年");
       }
    }
}


