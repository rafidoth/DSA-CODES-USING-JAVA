import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char tar = in.next().charAt(0);
        if(stringLinearSearch(str, tar)){
            System.out.println("FOUND");
        }else{
            System.out.println("NOT FOUND");
        }

    }
    static boolean stringLinearSearch(String str, char target){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                return true;
            }
        }

        return false;
    }
}
