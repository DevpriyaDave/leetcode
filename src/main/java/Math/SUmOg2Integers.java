package Math;

import java.util.Arrays;

/**
 * Created by devpriyadave on 4/7/18.
 *
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

 Example:
 Given a = 1 and b = 2, return 3.

Idea is to get the bits and do if else
 */
public class SUmOg2Integers {
    public int getSum(int a, int b) {
        char[] bitA = Integer.toBinaryString(a).toCharArray();
        char[] bitB = Integer.toBinaryString(b).toCharArray();
        int ansLen = bitA.length > bitB.length ? bitA.length+1 : bitB.length + 1;
        char[] bitAns = new char[ansLen];
        char carry = '0';
        int k = bitAns.length -1;
        for(int i = bitA.length - 1, j= bitB.length - 1; k >=0 ;i--, j -- , k--) {

            if(i >=0  && j >=0) {
                if (bitA[i] == '1' && bitB[j] == '1' && carry == '1') {
                    bitAns[k] = '1';
                    carry = '1';

                } else if (bitA[i] == '1' && bitB[j] == '1') {
                    bitAns[k] = '0';
                    carry = '1';

                } else if (bitA[i] == '1' && bitB[j] == '0' && carry == '1') {
                    bitAns[k] = '0';
                    carry = '1';

                } else if (bitA[i] == '0' && bitB[j] == '1' && carry == '1') {
                    bitAns[k] = '0';
                    carry = '1';

                } else {
                    bitAns[k] = '1';
                    carry = '0';

                }
            } else if(i>=0) {
                if (bitA[i] == '1' && carry == '1') {
                    bitAns[k] = '1';
                    carry = '0';

                } else if (bitA[i] == '0' && carry == '1') {
                    bitAns[k] = '1';
                    carry = '0';

                }  else {
                    bitAns[k] = bitA[i];
                }

            } else if(j>=0) {
                if (bitB[j] == '1' && carry == '1') {
                    bitAns[k] = '1';
                    carry = '0';

                } else if (bitB[i] == '0' && carry == '1') {
                    bitAns[k] = '1';
                    carry = '0';

                }  else {
                    bitAns[k] = bitB[i];
                }

            }  else {
                if (carry == '1') {
                    bitAns[k] = '1';
                    carry = '0';

                } else {
                    bitAns[k] = '0';

                };

            }


        }
        return Integer.parseInt(Arrays.toString(bitAns));

    }
}
