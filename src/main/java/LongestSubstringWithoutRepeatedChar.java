/**
 * Created by devpriyadave on 2/7/18.
 */
public class LongestSubstringWithoutRepeatedChar {

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     * <p>
     * Examples:
     * <p>
     * Given "abcabcbb", the answer is "abc", which the length is 3.
     * <p>
     * Given "bbbbb", the answer is "b", with the length of 1.
     * <p>
     * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring,
     * "pwke" is a subsequence and not a substring.
     */

    /**
     *
     * Solution
     * Find all the indices of each element and subtrack between conjugate indices to see if the difference is large
     * Example
     * abcabcbb
     * a 03
     * b 1467
     * c 3
     * pwwkew
     * p 0
     * w 125
     * k 3
     * e 4
     * abbabb
     * a 03
     * b 1245
     */

    public int lengthOfLongestSubstring(String s) {
        char[] givenString = s.toCharArray();





        return 0;
    }
}
