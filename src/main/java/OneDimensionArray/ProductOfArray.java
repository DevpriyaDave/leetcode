package OneDimensionArray;

/**
 * Created by devpriyadave on 5/2/18.
 */
public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length == 0 ) {
            return nums;
        }
        int pastMult = 1;
        int futureMult = 1;
        int[] past = new int[nums.length];
        int[] future = new int[nums.length];
        for(int i = 0, j = nums.length-1; i < nums.length; i++, j--) {
            past[i] = pastMult;
            pastMult = pastMult * nums[i];
        }
        for(int i = nums.length-1; i >= 0 ; i++) {
            future[i] = futureMult;
            futureMult = futureMult * nums[i];
        }
        for(int i = 0; i<nums.length; i++) {
            nums[i] = past[i] * future[i];
        }
        return nums;
    }
}
