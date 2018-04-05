package OneDimensionArray;

/**
 * Created by devpriyadave on 4/1/18.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        //I can possibley sort the array but needs linear runtime
        StringBuilder s = new StringBuilder();

        for(int i=0;i<nums.length; i++) {
            if(s.indexOf(String.valueOf(nums[i]))>0) {
                s.deleteCharAt(s.indexOf(String.valueOf(nums[i])));
            } else {
                s.append(String.valueOf(nums[i]));
            }
        }
        return Integer.parseInt(s.toString());

    }
    class Solution {
        public int singleNumber(int[] nums) {
            int ans =0;

            int len = nums.length;
            for(int i=0;i!=len;i++)
                ans ^= nums[i];

            return ans;
        }
    }
}
