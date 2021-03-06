package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 1},
                9)));
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (temp.containsKey(target - nums[i])) {
                return new int[]{temp.get(target - nums[i]), i};
            }
            temp.put(nums[i], i);
        }
        return new int[0];
    }
}
