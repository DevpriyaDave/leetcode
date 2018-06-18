package OneDimensionArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by devpriyadave on 4/5/18.
 */
public class DisappearedArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;

        List<Integer> list = new ArrayList<Integer>();

        here: do{
            if(i == nums.length) {
                break;
            }
            if(nums[i] == -1 || nums[i] == 0) {
                i++;
                continue here;
            }

            int j = nums[i] - 1;
            if(nums[j] == -1) {
                list.add(new Integer(i+1));
                nums[i] = 0;
                i++;
            } else {
                i = nums[j];
                nums[j] = -1;

            }

        } while(true);

        return list;

    }

    public List<Integer> sol(int[] nums) {
        {
            List<Integer> ret = new ArrayList<Integer>();

            for(int i = 0; i < nums.length; i++) {
                int val = Math.abs(nums[i]) - 1;
                if(nums[val] > 0) {
                    nums[val] = -nums[val];
                }
            }

            for(int i = 0; i < nums.length; i++) {
                if(nums[i] > 0) {
                    ret.add(i+1);
                }
            }
            return ret;
        }
    }


    public static void main(String[] args) {
        DisappearedArray disappearedArray = new DisappearedArray();
        System.out.println(disappearedArray.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}
