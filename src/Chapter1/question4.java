package Chapter1;

public class question4 {
    static int med3(int a, int b, int c) {
        if (a >= c)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;

            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("med3(3,2,1) = " + med3(3,2,1));      // a＞b＞c
        System.out.println("med3(3,2,2) = " + med3(3,2,2));      // a＞b＝c
        System.out.println("med3(3,1,2) = " + med3(3,1,2));      // a＞c＞b
        System.out.println("med3(3,2,3) = " + med3(3,2,3));      // a＝c＞b
        System.out.println("med3(2,1,3) = " + med3(2,1,3));      // c＞a＞b
        System.out.println("med3(3,3,2) = " + med3(3,3,2));      // a＝b＞c
        System.out.println("med3(3,3,3) = " + med3(3,3,3));      // a＝b＝c
        System.out.println("med3(2,2,3) = " + med3(2,2,3));      // c＞a＝b
        System.out.println("med3(2,3,1) = " + med3(2,3,1));      // b＞a＞c
        System.out.println("med3(2,3,2) = " + med3(2,3,2));      // b＞a＝c
        System.out.println("med3(1,3,2) = " + med3(1,3,2));      // b＞c＞a
        System.out.println("med3(2,3,3) = " + med3(2,3,3));      // b＝c＞a
        System.out.println("med3(1,2,3) = " + med3(1,2,3));      // c＞b＞a
    }
}

// Question 5

// 하나의 if문 조건에 연산이 많이붙어있기에 시간소요가 많이 일어난다.
// 또한 첫번째 판단에서 뒤집은 판단이 계속되기에, 또한 처음 if가 성립되지 않았을때
// 2번째도 같은판단을 하기에 효율이 나빠진다.
