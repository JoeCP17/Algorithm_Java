package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
HashMap을 이용해 문제 해결

 */
public class Q1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndex = new HashMap<>(); //valueIndex라는 HashMap특성을 가진 변수 생성

        for (int i = 0; i < nums.length; i++) {
            if (valueIndex.containsKey(target - nums[i])) {
                return new int[]{i, valueIndex.get(target - nums[i])};
            }
            valueIndex.put(nums[i], i);
        }
        return new int[]{};
    }

}