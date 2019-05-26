package com.neuedu.test;

public class JieCheng {
    public static void main(String[] args) {
        int sum = 1;
        for(int i=1;i<10;i++){
            //定义一个用来存储阶层的值
            /*for(int j=1;j<=i;j++){//实现阶层的循环*/
            /*sum *= i;*/
                sum = sum*i;
        }
        System.out.println("9的阶层是："+sum);
    }
    }

