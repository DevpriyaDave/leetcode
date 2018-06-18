package OneDimensionArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by devpriyadave on 4/30/18.
 */
public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        String[] finalRanks = new String[nums.length];
        if(nums==null || nums.length == 0) {
            return new String[]{};
        }
        Map<Integer, Integer> ranks  = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++) {
            ranks.put(nums[i], i);
        }
        Arrays.sort(nums);
        int count = nums.length;
        for(int i = 0; i < nums.length; i ++) {
            if(count > 3) {
                finalRanks[ranks.get(nums[i])] = String.valueOf(count);
                count --;
            }else if (count == 1) {
                finalRanks[ranks.get(nums[i])] = "Gold Medal";
                count--;
            }else if (count == 2) {
                finalRanks[ranks.get(nums[i])] = "Silver Medal";
                count--;
            }else if (count == 3) {
                finalRanks[ranks.get(nums[i])] = "Bronze Medal";
                count--;
            }

        }
        return finalRanks;
    }
}
