package Chapter3;

// 순차 배열 사용 -> 왜? 정렬되어있지 않은 값을 검색하기 때문에

// 1. a 배열에 입력 값 넣기
// key값 입력 받기
// key 값 토대로 맞는 값 찾기
// 해당하는 숫자 인덱스 idx 배열에 저장
// length로 배열 길이 반환

import java.util.Scanner;

// searchIdx : a 배열 값중 key에 해당하는 값 idx 배열에 저장
public class Q3_Search {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[count++] = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟 수 입력 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];


        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값 ");
        int ky = stdIn.nextInt();
        int[] idx = new int[num];

        int count = searchIdx(x, num, ky, idx);

        if (count == 0) {
            System.out.println("그런 값이 없습니다.");
        } else {
            for (int i : idx) {
                System.out.println(i + " ");

            }
        }
    }

}

