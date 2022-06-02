package Chapter2;

import java.util.Scanner;

public class Reverse_copy_array {
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    // b array를 a array로 reverse해서 저장
    static void recopy(int[] a, int[] b) {
        if (b.length != 0 )
            for(int i = 0; i<b.length; i++)
                a[i] = b[i];

        for(int i = 0; i<a.length / 2; i++)
            swap(a,i,a.length - i - 1);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 입력 : ");
        int num = stdIn.nextInt();

        int[] a = new int[num];
        int[] b = new int[num];

        for (int i = 0;i < b.length; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }
        recopy(a,b);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]" + a[i]);
        }
    }
}
