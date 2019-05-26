package com.neuedu.test;

public class JiOuShu {
    public static void main(String[] args) {

        int sum1=0;//偶数
        int sum2=0;//奇数
        for(int i=1; i<=100; i++){
            if(i%2==0){
                sum1 += i;

            }else if(i%2 == 1){
                sum2 += i;
            }

        }
        System.out.println("奇数和为"+sum2);
        System.out.println("偶数和为"+sum1);

    }
}
