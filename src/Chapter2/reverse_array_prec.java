package Chapter2;

import java.util.Scanner;

public class reverse_array_prec {


    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
            System.out.println("a[" + i + "] 와" + "a[" + (a.length - i - 1) + "]를 교환합니다.");
            for(int j =0; j <a.length; j++)
                System.out.println(a[j] + " ");
        }
    }

    static int sumOf(int[] a) {
        int sum = 0 ;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int num = stdin.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = stdin.nextInt();
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }

        reverse(x);

        System.out.println("\n 정렬을 종료합니다.");

        int max = sumOf(x);

        System.out.println("배열 총 합계 : " + max);
    }


}

