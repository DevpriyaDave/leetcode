package OneDimensionArray;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by devpriyadave on 4/16/18.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums) {
            if(map.get(i)==null) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        int ans = 0;
        int maxCount = 0;
        for(int k : map.keySet()) {
            if(map.get(k) > maxCount) {
                ans = k;
                maxCount = map.get(k);
            }
        }

        return ans;
    }
}
