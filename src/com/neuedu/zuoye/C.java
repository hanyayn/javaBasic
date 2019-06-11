package com.neuedu.zuoye;
import java.util.Scanner;

public class C {

public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("请输选择要制作的披萨:1.培根披萨   2.海鲜披萨");
            int num = input.nextInt();
            Pizza p=B.getPizza(num);
            System.out.println(p.show());


}
    }



