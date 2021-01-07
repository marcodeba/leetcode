// 判断是否是回文
package simple;

public class CheckPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123454321));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int revert = 0;
        while (x > revert) {
            revert = revert * 10 + x % 10;
            x = x / 10;
        }
        return revert == x || x == revert / 10;
    }
}