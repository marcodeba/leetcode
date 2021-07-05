package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int right = 0, ans = 0;
        Set<Character> occ = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                occ.remove(s.charAt(i - 1));
            }
            while (right < s.length() && !occ.contains(s.charAt(right))) {
                occ.add(s.charAt(right));
                right++;
            }
            ans = Math.max(ans, right - i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution3.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution3.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution3.lengthOfLongestSubstring(""));
    }
}
