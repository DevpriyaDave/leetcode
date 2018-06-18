package OneDimensionArray;

/**
 * Created by devpriyadave on 4/14/18.
 */
public class MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int diff = 0;
        do {
            for(int i=1; i < nums.length; i++) {
                if(nums[i]!= max) {
                    int temp = nums[i] + diff;
                    max = Math.max(max, temp);
                    min = Math.min(min, temp);
                }

            }
            diff = diff + (max - min);
        } while(min!=max);

        return diff;


    }
}
