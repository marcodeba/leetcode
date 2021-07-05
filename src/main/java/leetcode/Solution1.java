package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] ints = solution1.twoSum(new int[]{2, 7, 11, 1}, 9);
        for (int i : ints) {
            System.out.println(i);
        }
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
