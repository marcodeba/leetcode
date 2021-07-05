package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    private int lengthOfLongestSubstring(String s) {
        int right = 0, result = 0;
        Set<Character> occ = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                occ.remove(s.charAt(i - 1));
            }
            while (right < s.length() && !occ.contains(s.charAt(right))) {
                occ.add(s.charAt(right));
                right++;
            }
            result = Math.max(result, right - i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring(""));
    }
}
