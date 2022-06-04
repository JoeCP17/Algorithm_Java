package leetcode;

import java.util.Scanner;

public class Q9 {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else if (x == 0)
            return true;
        else{
            String str = "";
            int tmp = x;
            while (tmp > 0){
                str += (tmp % 10 + "");
                tmp = tmp / 10;
            }
            if (Long.parseLong(str) - x == 0)
                return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int x = stdIn.nextInt();

        isPalindrome(x);
    }
}


