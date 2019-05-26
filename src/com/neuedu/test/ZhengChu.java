package com.neuedu.test;

import java.util.Scanner;

public class ZhengChu {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner input=new Scanner(System.in);//控制台能输入字
        int a=input.nextInt();//控制台能输入字int sum=0;
        int sum=0;
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

    }




}
