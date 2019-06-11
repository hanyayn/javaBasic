package com.neuedu.fuxi1;

public class Yuan extends FuLei {
    protected int radius;
    public int getR() {
        return radius;
    }

    public void setR(int radius) {
        this.radius = radius;
    }

    public void mianji( ){
        System.out.println(Math.PI*Math.pow(radius,2));
    }
    public void zhouchang(){
        System.out.println(2*Math.PI*radius);
    }
}
