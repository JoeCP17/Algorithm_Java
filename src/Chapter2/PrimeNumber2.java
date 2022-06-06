package Chapter2;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500]; // 소수를 저장하는 배열

        prime[ptr++] = 2; // 2는 소수

        for (int n = 3; n <= 1000; n+= 2) { // 대상은 홀수만
            int i;
            for (i = 1; i < ptr; i++) { // 이미 찾은 소수로 나눈다.
                counter++;
                if (n % prime[i] == 0) // 나눴을때 0 이면 소수가 더이상 x
                    break; // 반복의 필요성 없다.
            }
            if (ptr == i) // 끝까지 나눴는데 소수가 아니다
                prime[ptr++] = n; // 소수배열에 저장
            }
        for (int i = 0; i <= ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈을 실행한 횟수 : " + counter);

    }
}
