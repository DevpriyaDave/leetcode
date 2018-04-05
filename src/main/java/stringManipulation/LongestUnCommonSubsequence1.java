package stringManipulation;

/**
 * Created by devpriyadave on 4/1/18.
 */
public class LongestUnCommonSubsequence1 {
    public int findLUSlength(String a, String b) {
        if(a.length() >= b.length()) {
            if(!b.contains(a)) {
                return  a.length();
            }
        } else {
            if(!a.contains(b)) {
                return b.length();
            }
        }

        return -1;
    }
    class Solution {
        public int findLUSlength(String a, String b) {
            if(a.length() == b.length()) {
                return a.equals(b) ? -1 : a.length();
            }
            else return Math.max(a.length(), b.length());
        }
    }
}
