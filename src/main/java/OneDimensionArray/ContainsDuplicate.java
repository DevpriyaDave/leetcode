package OneDimensionArray;

import java.util.Arrays;

/**
 * Created by devpriyadave on 4/28/18.
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length < 1) {
            return false;
        }
        Arrays.sort(nums);
        for(int i =1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        boolean ans = new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,4});
        System.out.println(ans);
    }
}
