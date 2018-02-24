import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by devpriyadave on 2/24/18.
 *
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 *
 * Input: [1,4,3,2]

 Output: 4
 Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

 -10 123 4 8 -11 9

 -11 -10 4 8 9 123 -> -11, 4, 9

 Logic -> sort and then take the sum of odd position
 */
public class ArrayPartitionOne {

    public int myarrayPairSum(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for(int i =0 ; i < nums.length; i=i+2) {
            sum = sum + nums[i];
        }
        return sum;

    }
    public int arrayPairSum(int[] nums) {

        int [] t = new int[20001];
        for(int i = 0; i<nums.length; i++){
            t[nums[i]+10000]++;
        }
        int n = nums.length/2;
        int sum = 0;
        /*int i = 20000;
        while(n>0){
            int j = t[i]/2;
            j = Math.min(n,j);
            sum+=((i-10000)*j);
            n-=j;
            if(t[i]%2==1)
                t[i-1]++;
            i--;
        }*/
        // int cnt = n;
        int carry = 0;
        for(int i =20000; i>=0 && n>0; i--){
            if(t[i]== 0) continue;
            int val = i-10000;
            // int remain = n-cnt;
            int canBeUsed = (t[i]+carry)/2;
            carry = (t[i]+carry)%2;
            int x = Math.min(n, canBeUsed );
            n -= x;
            sum+= x*val;
            // System.out.println(i+" "+ t[i]+" "+n+" "+sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayPartitionOne arrayPartitionOne = new ArrayPartitionOne();
        int[] data = {-10 , 123, 4, 8, -11, 9};
        System.out.println(arrayPartitionOne.myarrayPairSum(data));
    }
}
