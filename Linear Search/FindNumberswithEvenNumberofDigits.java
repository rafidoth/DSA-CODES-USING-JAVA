public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(digitCounter(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }
    static int digitCounter(int n){
        String str = Integer.toString(n);
        int len = str.length();
        return len;
    }
}

