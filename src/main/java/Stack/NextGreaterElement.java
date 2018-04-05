package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by devpriyadave on 3/31/18.
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 Output: [-1,3,-1]
 */
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //O(n^2) space is O(n) retreival is O(1)
        //Create a hashmap with keys and default value as -1
        //for each enxt element interate through the list of keys and add the number as value if value is -1

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i< nums2.length; i++) {
            Integer curr = new Integer(nums2[i]);
            for(Integer k : map.keySet()) {
                if(map.get(k) == -1 && k<curr) {
                    map.put(k, curr);
                }
            }
            map.put(curr, -1);
        }

        int[] ans = new int[nums1.length];
        for(int i =0; i< nums1.length; i++) {

                ans[i] = map.get(nums1[i]);


        }

        return ans;

        //TODO
        /**
         * see if it can be done without O(n) space
         * converting int to Integer - grrrr - find better way
         */


    }

    public int[] nextGreaterElement2(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.get(findNums[i]); // if not presnet put -1
        return findNums;
    }

}


