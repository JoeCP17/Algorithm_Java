package Chapter2;

import java.util.Scanner;

public class CopyArray {
    static void copy(int[] a, int[] b) {
        if (b.length != 0){
            for (int i = 0; i < b.length; i++) {
                a[i] = b[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("배열b의 요솟수 : ");
        int num = stdIn.nextInt();

        int[] a = new int[num];
        int[] b = new int[num];

        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }
        copy(a,b);

        for(int i = 0; i<a.length; i++)
            System.out.println("a[" + i + "] : " + a[i]);
    }
}
