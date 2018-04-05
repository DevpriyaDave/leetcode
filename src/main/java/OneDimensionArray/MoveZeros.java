package OneDimensionArray;

/**
 * Created by devpriyadave on 4/4/18.
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int x = 1;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] == 0) {

                while(i+x < nums.length && nums[i+x]==0 ) {
                    x++;
                }
                if(i+x >= nums.length) {
                    break;
                }
                nums[i] = nums[i+x];
                nums[i+x] = 0;
            }

        }
        System.out.println("here");
    }


    public class Solution {

        public void moveZeroes(int[] nums) {

            int j = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j++;
                }
            }
        }
    }


    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        moveZeros.moveZeroes(new int[]{0, 0});
    }
}
