package reverseinteger;

/**
 * @author Robert-JQ
 * @desc 整数反转 https://leetcode-cn.com/problems/reverse-integer/
 * @date 2019/04/15 11:06
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverseInteger1(-2147483648));
    }

    private static int reverseInteger1(int x) {
        if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
            return 0;
        }
        StringBuffer sb = new StringBuffer(String.valueOf(Math.abs(x)));
        long result = Long.parseLong(sb.reverse().toString());
        if (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE) {
            return 0;
        }
        return (int) ((x >= 0) ? result : -result);
    }

}
