package Chapter2;

import java.util.Scanner;

class reverse {

    static void aa_swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void aa_reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            aa_swap(a, i, a.length - i - 1 );
        }
    }

}

public class reverse_array {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = stdin.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = stdin.nextInt();
        }

        reverse.aa_reverse(x);

        System.out.println("요소를 역순으로 정렬");
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }


    }
}
