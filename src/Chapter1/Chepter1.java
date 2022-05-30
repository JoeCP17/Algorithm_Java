package Chapter1;

import java.util.Scanner;

public class Chepter1 {

    static int max4(int a, int b, int c, int d) {
        int max = a ;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }

    static int max3(int a, int b, int c) {
        int max = a;

        if(max < b) max = b;
        if(max < c) max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println(max4(1,3,2,5));
        System.out.println(max3(1,5,7));


    }
}
