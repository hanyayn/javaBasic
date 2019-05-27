package com.neuedu.test;

import java.util.Scanner;

public class ChengJi {
    public static void main(String[] args) {
        System.out.println("请输入一个成绩数：");
        Scanner input=new Scanner(System.in);//控制台能输入字
        int a=input.nextInt();


        if(a>=90){
            System.out.println("A");
        }else if(a>=60&&a<90){
            System.out.println("B");
        }else if(a<60){
            System.out.println("C");
        } /*else {
            System.out.println("不及格");
        }*/
    }
}
