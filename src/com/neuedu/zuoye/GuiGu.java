package com.neuedu.zuoye;

public class GuiGu {
    public static void main(String[] args) {
        int i=21;

        while (true){
            if(i==1){
                break;
            }
            if(i%2==1){
                i=i*3+1;
                System.out.println(i);
            }else {
                i=i/2;
                System.out.println(i);
            }
        }
    }

}
