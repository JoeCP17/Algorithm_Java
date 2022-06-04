import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class task2 {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        int max = Arrays.stream(A).max().getAsInt();
        for(int i =0; i<A.length; i++){
            set.add(A[i]);
        }
        for(int i = 1; i<= max+1; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 1;
        int result = solution(a);
        System.out.println(result);
    }
}
