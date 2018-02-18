import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by devpriyadave on 2/4/18.
 * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

 Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

 Example 1:
 Input: [1, 2, 2, 3, 1]
 Output: 2
 Explanation:
 The input array has a degree of 2 because both elements 1 and 2 appear twice.
 Of the subarrays that have the same degree:
 [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 The shortest length is 2. So return 2.
 Example 2:
 Input: [1,2,2,3,1,4,2]
 Output: 6
 */
public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {

        int lengOfSubArray = findDegree(nums);
        return lengOfSubArray;
    }

    private int findDegree(int[] nums) {
        Map<Integer, Integer> frequecny = new HashMap<Integer, Integer>();
        Map<Integer, ArrayList<Integer>> keys = new HashMap<Integer, ArrayList<Integer>>();
        int max = 0;
       for(int i=0; i <nums.length; i++) {
           if(frequecny.containsKey(nums[i])){
               frequecny.put(nums[i], frequecny.get(nums[i])+1);
               ArrayList<Integer> position = keys.get(nums[i]);
               position.add(i);
               keys.put(nums[i], position);
           } else {
               ArrayList<Integer> position = new ArrayList<Integer>();
               frequecny.put(nums[i], 1);
               position.add(i);
               keys.put(nums[i], position);
           }
           if(max < frequecny.get(nums[i])) {
               max = frequecny.get(nums[i]);
           }

       }
        System.out.println(max);
       int diff = Integer.MAX_VALUE;
        for(int key : frequecny.keySet()) {
            if(frequecny.get(key)== max) {
                ArrayList<Integer> temp = keys.get(key);
                int a = temp.get(0);
                int b = temp.get(temp.size()-1);
                System.out.println(frequecny.get(key) + " " +key +" " +a + " " + b);
                int tempDiff = b-a;
                if(diff > tempDiff){
                    diff = tempDiff;
                }

            }
        }
        return diff+1;

    }

    public static void main(String args[]) {
        int[] nums = {1,2,2,3,1,4,2};
        DegreeOfAnArray degreeOfAnArray = new DegreeOfAnArray();
        int size = degreeOfAnArray.findShortestSubArray(nums);
        System.out.println(size);


    }
}
