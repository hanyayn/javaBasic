package com.neuedu.JiCheng;

public class Yuan extends TuXing {
//    定义一个图形类
//2 创建图形 圆形 正方形 有自己的属性 例如圆形的特征 都有半径 分别定义自己的计算面积和计算周长
//3 创建main方法 进行测试 创建对象 调用方法计算面积和周长

    private int  radius;
    public void  mianji(int radius){
        System.out.println(Math.PI*Math.pow(radius,2));
    }
    public void zhouchang(int radius){
        System.out.println(2*Math.PI*radius);
    }


}
