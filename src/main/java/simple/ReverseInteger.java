// 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
package simple;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123456780));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x > 0) {
            int pop = x % 10;
            x = x / 10;
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
                throw new RuntimeException("数据越界");
            }
            result = result * 10 + pop;
        }
        return result;
    }
}
