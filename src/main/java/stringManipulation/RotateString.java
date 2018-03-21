package stringManipulation; /**
 * Created by devpriyadave on 3/18/18.
 */

/**
 * We are given two strings, A and B.

 A shift on A consists of taking string A and moving the leftmost character to the rightmost position.
 For example, if A = 'abcde', then it will be 'bcdea' after one shift on A.
 Return True if and only if A can become B after some number of shifts on A.

 Example 1:
 Input: A = 'abcde', B = 'cdeab'
 bbccdc cdccbb
 Output: true

 Example 2:
 Input: A = 'abcde', B = 'abced'
 Output: false

 Bruteforce is to add each element to back and compare with B
 start pointer at 0 and length - 1

 compare if lenght is equal
 if not break

 if equal then
 find precesse of 0 and last  and do ++ for the pointer on the string A

 */
public class RotateString {
    public boolean rotateString(String A, String B) {
        int lengthA = A.length();
        int lengthB = B.length();
        if(lengthA != lengthB)
            return false;
        if(A.equals(B))
            return true;
        char startChar;
        char endChar;
        int midIndex;
        int startIndex;
        startChar = B.charAt(0);
        endChar = B.charAt(lengthB -1);
        midIndex = A.lastIndexOf(startChar);
        startIndex = A.indexOf(endChar);
        if(midIndex == -1 || startIndex == -1)
            return false;
        int i = 1;
        int j = lengthB - 2;
        while(i < j) {
             startChar = B.charAt(i);
             endChar = B.charAt(j);
             midIndex = midIndex+1;
             startIndex = startIndex-1;
            char startCharA;
            char endCharA;
            if(midIndex < lengthA) {
                startCharA = A.charAt(midIndex);
                if(startChar != startCharA)

                    return false;
            }
            if(startIndex > 0) {
                endCharA = A.charAt(startIndex);
                if(endChar != endCharA){
                    return false;
                }

            }

            i++;
            j--;
        }

        return true;
    }

    public boolean rotateStringCorrect(String A, String B) {
        return A.length() == B.length() ?(A+A).contains(B) : false;
    }
    public static void main(String[] args) {
        RotateString rotateString = new RotateString();
        System.out.println(rotateString.rotateString("gcmbf", "fgcmb"));

    }
}
