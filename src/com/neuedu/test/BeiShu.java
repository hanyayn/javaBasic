package com.neuedu.test;

public class BeiShu {
    public static void main(String[] args) {
        int sum1 = 0;
        int a = 1;
        while(a<200){
            if(a%3 == 0){
                sum1 += a;
            }
            a++;
        }
        System.out.println(sum1);
    }
}
