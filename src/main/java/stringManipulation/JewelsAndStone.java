package stringManipulation;

/**
 * Created by devpriyadave on 2/19/18.
 *
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.


 The letters in J are guaranteed distinct, and all characters in J and S are letters.
 Letters are case sensitive, so "a" is considered a different type of stone from "A"
 Input: J = "aA", S = "aAAbbbb"
 Output: 3
 Input: J = "z", S = "ZZ"
 Output: 0

 Logic
 iterate through S check in J


 CornerCase
 S or J is empty

 Performace
 check if S is larger of J and change logic
 can also check if S or J are all non letters than return 0
 */

public class JewelsAndStone {

    public int mynumJewelsInStones(String J, String S) {
        if(S.length() == 0 || J.length() == 0) {
            return 0;
        }
        int count = 0;
            for (int i = 0; i < S.toCharArray().length; i++) {
                if (J.indexOf(S.charAt(i)) > -1) {
                    count++;
                }
            }
            return count;

    }

    public static void main(String[] args) {
        JewelsAndStone jewelsAndStone = new JewelsAndStone();
        String J = "z";
        String S = "aAAbbbbb";
        System.out.println(jewelsAndStone.mynumJewelsInStones(J, S));
    }
}
