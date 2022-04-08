package Chapter3;

import java.util.Scanner;

public class SeqSearchScanning {
    static int seqsearchSen(int[] a, int n, int key) {
        System.out.println(" |");
        for (int i = 0; i < n; i++)
            System.out.printf("%2d", i);
        System.out.println();
        System.out.println("--+");
        for (int i = 0; i < n; i++)
            System.out.println("--");
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("  | ");
            for (int j = 0; j < i; j++) {
                System.out.println("  ");
            }
            System.out.println("*");
            System.out.printf("%2d|", i);
            for (int j = 0 ; j < n; j++)
                System.out.printf("%2d", a[j]);
            System.out.println();
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟 수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        System.out.printf("검색할 값 : ");
        int ky = stdIn.nextInt();
        int idx = seqsearchSen(x, num, ky);

        if (idx == -1)
            System.out.println("그 값에 요소가 없습니다.");
        else
            System.out.println(ky+"은 x[" + idx + "]에 있습니다.");

    }

}
