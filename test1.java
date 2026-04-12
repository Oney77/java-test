package demo1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("个位是："+a%10);
        System.out.println("十位是："+a/10%10);
        System.out.println("百位是："+a/100);

    }
}
