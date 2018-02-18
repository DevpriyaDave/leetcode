/**
 * Created by devpriyadave on 2/15/18.
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Input: 123456
 Output:  321
 Input: -123
 Output: -321
 Input: 120
 Output: 21

 Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 123 % 10 = 3
  123 / 10 =12
 12 % 10 = 2
 */
public class ReverseNumber {

    public int myReverse(int x) {
        Integer number = new Integer(x);
        boolean isNegative = false;
        if(x <= Integer.MIN_VALUE) {
            return 0;
        }
        if(number < 0) {
            System.out.println(number);
            number = -number;
            isNegative = true;
            System.out.println(number);
        }
        char charArray[] =number.toString().toCharArray();
        int size = charArray.length;
        for(int start=0,  end = size-1; start < size/2; start++, end--){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

        }
       String num = new String(charArray);
        if(Long.parseLong(num) > Integer.MAX_VALUE) {
            return 0;
        } else {
            return isNegative ? (-1)*Integer.parseInt(num) : Integer.parseInt(num);
        }




    }
    public int reverse(int x) {
        long result = 0;
        for(; x != 0; x /= 10){
            result = result * 10 + x % 10;
        }
        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int)result;
    }

    public static void main(String args[]){
        ReverseNumber reverseNumber = new ReverseNumber();
        int num = reverseNumber.myReverse(-2147483648);
        System.out.println(num);
    }
}
