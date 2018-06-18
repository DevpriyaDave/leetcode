package OneDimensionArray;

import java.util.Arrays;

/**
 * Created by devpriyadave on 4/26/18.
 */
public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for(int i =0; i < numbers.length; i++) {
            int search = target - numbers[i];
            int found = Arrays.binarySearch(numbers, search);
            if(found > 0) {
                ans[0] = i+1;
                ans[1] = found+1;
                return ans;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] a = {2,3,4};
        new TwoSum2().twoSum(a, 6);

    }
}
