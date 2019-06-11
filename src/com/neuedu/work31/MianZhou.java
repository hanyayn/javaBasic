package com.neuedu.work31;

public class MianZhou {
    protected float width;
    protected float height;
    public double area() {
        return width * height;
    }
    public double zhouCh() {
        return width + height;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
}
//import com.zhang.na.Shape1;
//public class Rectangle extends Shape1 {
//    public double zhouCh() {
//        return 2 * (width + height);
//    }
//}
//import com.zhang.na.Shape1;
//public class Triangle extends Shape1 {
//    double a;
//    public double zhouCh(){
//        return (2*a+width);
//    }
//    public double getA() {
//        return a;
//    }
//    public void setA(double a) {
//        this.a = a;
//    }
//}
//public class E {
//    public static void main(String[] args) {
//        System.out.println("请设定矩形长、宽：");
//        Rectangle rec=new Rectangle();
//        Triangle tri=new Triangle();
//        rec.setHeight(1);
//        rec.setWidth(2);
//        System.out.println(rec.zhouCh());
//        System.out.println(rec.area());
//        System.out.println("请设定三角形底和高：");
//        tri.setWidth(3);
//        tri.setHeight(4);
//        tri.setA(2);
//        System.out.println(tri.area()/2);
//        System.out.println(tri.zhouCh());
//    }

