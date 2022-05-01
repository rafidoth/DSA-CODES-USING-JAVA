import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {};
        int target = in.nextInt();
        int result = linearSearch(arr, target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}