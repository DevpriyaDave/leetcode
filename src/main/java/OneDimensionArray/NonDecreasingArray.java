package OneDimensionArray;

/**
 * Created by devpriyadave on 5/7/18.
 */
public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        if(nums!=null && nums.length<2) {
            return true;
        }
        int count = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length-1; i ++) {
            if(nums[i] > nums[i+1]) {
                //max++;
                count++;
                if(nums[i+1] < min) {
                    max= max+i+1;

                } else {
                    min = nums[i+1];
                }
            } else {
                min = nums[i];
            }
            if(count>1 || max>1) {
                return false;
            }
        }
        return true;
    }
}
