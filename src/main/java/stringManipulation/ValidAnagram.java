package stringManipulation;

import java.util.Arrays;

/**
 * Created by devpriyadave on 4/25/18.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) {
            return false;
        }
        if(s.length()!=t.length()) {
            return false;
        }
        char[] sortedS = s.toCharArray();

        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedS);
        Arrays.sort(sortedT);
        for(char c: sortedS) {
            System.out.println(c-'a');
        }
        return Arrays.equals(sortedS, sortedT);

    }

    public static void main(String[] args) {
        boolean ans = new ValidAnagram().isAnagram("ab҂c","abc҂");
        System.out.println(ans);
    }
}
