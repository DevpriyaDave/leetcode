package OneDimensionArray;

/**
 * Created by devpriyadave on 4/1/18.
 */
public class MaxConseutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
    //idea is to keep a sum as we see 1 keep adding it
        //as once sees 0 compare with previous sum if greater replace max else continue
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] == 0) {
                if(sum > max) {
                    max = sum;
                }
                sum = 0;
            } else {
                sum++;
            }
        }
        return (sum > max) ? sum : max;
    }

}
