package com.neuedu.zuoye;

public class BaconPicca extends Pizza{



        private int gram;

        public int getGram() {
            return gram;
        }

        public void setGram(int gram) {
            this.gram = gram;
        }
        public BaconPicca(){

        }
        public BaconPicca(String name,int price,int size,int gram){
            super(name,price,size);
            this.gram=gram;
        }

        @Override
        public String show() {
            return "名称"+super.getName()+"\n价格:"+super.getPrice()+"元"+"\n大小:"+super.getSize()+"寸"+"\n培根克数:"+gram;
        }
    }

