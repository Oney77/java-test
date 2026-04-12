package demo1;

public class heima4_12 {
    public static void main(String args[]) {
//        Random r = new Random();
//        int[] arr = {1, 2, 3, 4, 5};
//        int randomIndex = r.nextInt(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[randomIndex];
//            arr[randomIndex] = arr[i];
//            arr[i] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        int[] arr={1,2,3,4,5};
        for (int i = 0,j= arr.length-1; i<j;i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

}
