package leetcode;

// dividend : 나눌 수
// divisor : 나누는 수

// 나눴을때 소수점 외, 정수만 나오게 하는 문제

import java.util.Scanner;

class Solution{
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int res = 0;

        while (a - b >= 0) {
            int x = 0;
            while(a-(b<<1<<x) >= 0)
                x++;
            res += (1 << x);
            a -= (b << x);
        }
        return (dividend > 0 == divisor > 0) ? res : -res;
    }
}
