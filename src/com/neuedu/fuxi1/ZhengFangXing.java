package com.neuedu.fuxi1;

public class ZhengFangXing extends FuLei {
    private int chang;

    public int getKuan() {
        return kuan;
    }

    public void setKuan(int kuan) {
        this.kuan = kuan;
    }

    private int kuan;

    public int getChang() {
        return chang;
    }

    public void setChang(int chang) {
        this.chang = chang;
    }


    public void zhouchnag() {
        System.out.println("周长为："+2*(kuan+chang));
    }
    public void mianji() {
        System.out.println("面积为："+chang*kuan);
    }
}
