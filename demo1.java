package demo1;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b =sc.nextDouble();
        double area1=area(a,b);
        double area2=area(7,7);
        if(area1>area2)
            System.out.println("第一个更大");
        else System.out.println("第二个更大");
    }

    public static double area(double a, double b) {
        return a*b;

    }
}
