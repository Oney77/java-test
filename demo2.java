package demo1;

public class demo2 {
    public static void main(String[] args) {
        int[] a={11,22,33,44,55};
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if(i<a.length-1)
            System.out.print(a[i]+",");
            else
                System.out.print(a[i]);
        }
        System.out.print("]");
    }

}
