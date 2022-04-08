package Chapter3;

import java.util.Scanner;

public class SeqSearch {

    static int seqSearch(int[] a, int n, int key) {
//        int i = 0;
//         < for로 작성시 더 간추려진다. >
//        while (true) {
//            if (i == n) {
//                return -1;
//            }
//            if (a[i] == key) {
//                return i;
//            }
//            i++;
//        }
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟 수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값 : ");
        int ky = stdIn.nextInt();
        int idx = seqSearch(x, num, ky);

        if (idx == -1) {
            System.out.println("해당 요소가 존재하지 않습니다.");
        }
        else {
            System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
        }
    }
}
