package leetcode;

import java.util.Arrays;

public class Q35_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int match = Arrays.binarySearch(nums, target);

        return match >= 0 ? match : -match -1;
    }
}
