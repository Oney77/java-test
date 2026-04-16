package demo1;

import java.util.Random;

public class demo3 {
    public static void main(String[] args) {
        char[] a=new char[52];
        for(int i =0 ;i < a.length;i++)
        {
            if(i<=25)
                a[i]=(char)(96+i);
            else
                a[i]=(char)(65+i-26);
        }
        String result="";
        Random r=new Random();
        for (int i = 0; i<4;i++)
        {
            int randomIndex=r.nextInt(a.length);
            result=result+a[randomIndex];
        }
        int n=r.nextInt(10);
        result+=n;
        System.out.println(result);
    }
}
