package com.neuedu.test1;

public class Circle {
    private int radius;
    public void setRadius(int radius1){
        radius=radius1;
    }
    public int getRadius(){
        return radius;
    }

    public double zhouchang(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
}
