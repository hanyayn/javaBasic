package com.neuedu.test1;

public class HomeWork27 {
    private int height = 1;
    private int width = 1;

    public void setWidth(int width1) {
        width = width1;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height1) {
        height = height1;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return "宽" + width + "高" + height;

    }


        public void zhouchang(){
        int reslut = (height + width) * 2;
            System.out.println(reslut);
    }

    public void zhouchang(int width1) {
        width=width1;
        int reslut = (height + width) * 2;
        System.out.println(reslut);
    }

    public void zhouchang(int width1,int height1) {
        width=width1;
        height=height1;
        int reslut = (height + width) * 2;
        System.out.println(reslut);
    }

    }
























//27号讲的方法
    /*public void zhouchang() {
        int reslut = (height + width) * 2;
    }

    public void zhouchang(int width1) {
        width=width1;
        int reslut = (height + width) * 2;
    }

    public void zhouchang(int width1,int height1) {
        width=width1;
        height=height1;
        int reslut = (height + width) * 2;
    }
    public void print_rec(){
        System.out.println();
    }

    public void area() {
        int reslut = height * width;
    }*/


