public class max_wealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        int[]  result = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int sum =0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            result[i] = sum;
        }

        return findMax(result);

    }
    static int findMax(int[] a){
        int ma = Integer.MIN_VALUE;
        for (int i = 0; i <a.length; i++) {
            if(a[i]>=ma){
                ma = a[i];
            }
        }
        return ma;
    }
}
