package stringManipulation;

import java.util.Collections;

/**
 * Created by devpriyadave on 3/19/18.
 *
 * Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".
 */
public class ReverseString {
    public String reverseString(String s) {
        if(s.equals("") || s == null) {
            return s;
        }
        int len = s.length();
        int i = 0;
        int j = len - 1;
        char[]  sArray = s.toCharArray();
        while(i<j) {
            char temp = sArray[i];
            sArray[i] = sArray[j];
            sArray[j] = temp;
            i++;
            j--;
        }
        return new String(sArray);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString("hello"));
    }
}
