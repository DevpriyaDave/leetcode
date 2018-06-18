package stringManipulation;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by devpriyadave on 4/7/18.
 */
public class CountBinarySubstring {
    public int countBinarySubstrings(String s) {

        char[] zeros = new char[s.length()/2];
        char[] ones = new char[s.length()/2];
        Arrays.fill(zeros, '0');
        Arrays.fill(ones, '1');
        StringBuilder z = new StringBuilder(new String(zeros));
        StringBuilder o = new StringBuilder(new String(ones));
        StringBuilder zo = new StringBuilder();
        zo.append(z);
        zo.append(o);
        StringBuilder oz = new StringBuilder();
        oz.append(o);
        oz.append(z);
        int count = 0;
        while(zo.length()!= 0) {
            int ind = 0;
            while(s.indexOf(zo.toString(), ind)!=-1) {
                ind = s.indexOf(zo.toString(), ind);
                ind++;
                count++;
            }
            zo = zo.deleteCharAt(0);
            zo = zo.deleteCharAt(zo.length()-1);

        }

        while(oz.length()!=0) {
            int ind = 0;
            while(s.indexOf(oz.toString(), ind)!=-1) {
                ind = s.indexOf(oz.toString(), ind);
                ind++;
                count++;
            }
            oz = oz.deleteCharAt(0);
            oz = oz.deleteCharAt(oz.length()-1);
        }
        return count;

    }
    public int countBinarySubstringsSol(String s) {
        int prevRunLength = 0, curRunLength = 1, res = 0;
        for (int i=1;i<s.length();i++) {
            if (s.charAt(i) == s.charAt(i-1)) curRunLength++;
            else {
                prevRunLength = curRunLength;
                curRunLength = 1;
            }
            if (prevRunLength >= curRunLength) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        CountBinarySubstring co = new CountBinarySubstring();
        System.out.println(co.countBinarySubstringsSol("111000"));
    }
}
