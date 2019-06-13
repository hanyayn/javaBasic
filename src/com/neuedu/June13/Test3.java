package com.neuedu.June13;

import java.util.HashMap;
import java.util.Map;



public class Test3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
        System.out.println("================");

        map.remove(1);
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
        System.out.println("================");

        map.put(2,"周林");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}