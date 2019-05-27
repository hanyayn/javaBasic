package com.neuedu.test;

import java.util.Scanner;

public class ZhengChu {
    public static void main(String[] args) {

            System.out.println("请输入：");
            Scanner input = new Scanner(System.in);
            int a= input.nextInt();
            int b=a/100;
            int c=a%100/10;
            int d=a%10;
            if ((b+c+d)%9==0){
                System.out.println(a+"是9的倍数");
            }else System.out.println(a+"不是9的倍数");

        }

       /* int sum=0;
        while (a%10>0){
            sum=sum+a%10;
            a=a/10;
        }
        sum=sum+a;
        if(sum%9==0){
            System.out.println("可以");
        }else {
            System.out.println("不可以");
        }
*/
       /*int a=data/100;
        int b=data%100/10;
        int c=data%10;
        if((a+b+c)%9==0){
            System.out.println("能被9整除");
        }else ((a+b+c))*/
}
