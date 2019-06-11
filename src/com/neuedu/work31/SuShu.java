package com.neuedu.work31;

public class SuShu {
//    *判断101-200之间有多少个素数，并输出所有素数。
    public static void main(String[] args) {

        int a=0;
        int t=0;
        boolean b=false;
        for(int sum=101;sum<=200;sum++){
            for(int i=2;i<sum;i++){
                if(sum%i==0){
                    b=false;
                    break;
                } else  {
                    b=true;
                }
            }
            if (b){
                t++;
                System.out.println(sum+"是素数");
            }
        }
        System.out.println("一共有"+t+"个素数");
    }
}


