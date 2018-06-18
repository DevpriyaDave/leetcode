package OneDimensionArray;

import java.util.Arrays;

/**
 * Created by devpriyadave on 4/26/18.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int k = 0;
        int count = 0;
        for (int i : s) {
            if (k >= g.length) {
                return count;
            }
            if (i >= g[k]) {
                count++;
                k++;
            }

        }
        return count;
    }
}
