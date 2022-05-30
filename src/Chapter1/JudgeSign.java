package Chapter1;

import java.util.Scanner;

public class JudgeSign {
    public static String Judge(int num) {
        if (num > 0)
            return "양수입니다.";
        else if (num == 0)
            return "0 입니다.";

        else
            return "음수입니다.";


    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int a = stdIn.nextInt();

        System.out.println("이 수는" + Judge(a));


    }
}
