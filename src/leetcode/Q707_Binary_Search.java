package leetcode;

public class Q707_Binary_Search {
    public int search(int[] nums, int target) {
        int pv, left = 0, right = nums.length - 1;

        while (left <= right) {
            pv = left + (right - left) / 2;

            if(nums[pv] == target)
                return pv;

            if (target < nums[pv])
                right = pv - 1;

            else
                left = pv + 1;
        }
        return -1;
    }
}
