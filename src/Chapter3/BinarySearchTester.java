package Chapter3;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟 수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        System.out.println("오름차 순으로 입력해주세요.");

        System.out.println("x[0] : ");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.println("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky); // 배열 x에서 키 값이 ky인 요소를 검색

        if (idx < 0) {
            System.out.println("그 값의 요소는 없습니다.");
        } else {
            System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
        }
    }
}
