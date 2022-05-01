import java.util.Arrays;
import java.util.Scanner;

public class Search2Darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] twoArr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                twoArr[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.toString(search2D(twoArr)));
    }

    static int[] search2D(int[][] a){
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int[] i:a){
            for(int x:i){
                if(x>=mx){
                    mx = x;
                }
                if(x<=mn){
                    mn = x;
                }
            }
        }
        return new int[] {mx,mn};
    }
}
