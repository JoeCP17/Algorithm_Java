package Chapter3;

// 보초법 for

import java.util.Scanner;

public class SeqSearchSenFor {
    static int Seq(int[] a, int n, int key) {
        a[n] = key;

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner stnId = new Scanner(System.in);

        System.out.println("요솟 수 : ");
        int num = stnId.nextInt();
        int[] x = new int[num + 1];


        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = stnId.nextInt();
        }

        System.out.println("검색할 값 : ");
        int ky = stnId.nextInt();

        int idx = Seq(x, num, ky);

        if (idx == -1) {
            System.out.println("그런 요소는 없습니다.");
        }
        else {
            System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
        }
    }
}
