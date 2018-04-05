package TwoDimensionalArray;

/**
 * Created by devpriyadave on 3/31/18.
 */
public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        //Valid or not the number of elements should be equal in both the matrix
        int rOrig = nums.length;
        int cOrig = nums[0].length;
        if((rOrig*cOrig)!=(r*c)) {
            return  nums;
        }
        //reorder
        //step 1: get all the elements in array
        int[] temp = new int[rOrig*cOrig];
        int k = 0, l= 0;
        for(int i=0; i< rOrig; i++) {
            for(int j=0; j< cOrig; j++) {
                temp[k] = nums[i][j];
                k++;
            }
        }
        //step 2 : add to newly created matrix
        k = 0;
        int[][] ans = new int[r][c];
        for(int i=0; i< r; i++){
            for(int j=0; j<c; j++) {
                ans[i][j] = temp[k];
                k++;
            }
        }
        //trying to merge the 2 for loops - naaa
//
//        for(int i=0; i< rOrig; i++) {
//            for(int j=0; j< cOrig; j++) {
//                ans[k][l] = nums[i][j];
//                k++;
//                l++;
//                if(l>c-1) {
//                    l = 0;
//                }
//            }
//        }
        /**
         * one loop
         *
         * for (int i = 0; i < r; i++) {
         for (int j = 0; j < c; j++) {
         newNums[i][j] = nums[numsRow][numsCol];
         numsCol++;
         if (numsCol == n) {
         numsRow++;
         numsCol = 0;
         }
         }
         }
         */

        return ans;


    }
}
