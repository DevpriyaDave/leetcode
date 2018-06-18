package TwoDimensionalArray;

/**
 * Created by devpriyadave on 4/14/18.
 */
public class RangeAddition2 {
    public int maxCount(int m, int n, int[][] ops) {
        int minA = 0;
        int minB = 0;
        for(int i = 0; i < ops.length; i++) {
            minA = Math.min(minA, ops[i][0]);
            minB = Math.min(minB, ops[i][1]);
        }
        return minA ==0 || minB == 0 ? 1 : minA*minB;
    }
}
