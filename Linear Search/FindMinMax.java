import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = findMinMax(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }

    static int[] findMinMax(int[] a){
        int mi = Integer.MAX_VALUE;
        int ma = 0;
        for (int i = 0; i <a.length; i++) {
            if(a[i]>=ma){
                ma = a[i];
            }
            if(a[i]<=mi){
                mi = a[i];
            }
        }
        return new int[]{ma, mi};
    }
}
