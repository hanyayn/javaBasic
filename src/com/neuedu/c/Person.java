package com.neuedu.c;

public class Person {

    public String name;
    public int height;
    public int weigth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public void  sayHello(){
        System.out.println("hello,my name is xxx");
    }
}
