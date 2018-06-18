package stringManipulation;

/**
 * Created by devpriyadave on 4/5/18.
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {

        if((t==null || s==null ) && (!(t.length() > s.length()) || (t.length() - s.length() > 1))) {
            return ' ';
        }
        for(char e : t.toCharArray()) {
            int i = s.indexOf(e);
            if(i== -1) {
                return e;
            } else {
                s = s.replaceFirst( Character.toString(e), " ");
            }
        }
        return ' ';

    }

    class Solution {
        public char findTheDifference(String s, String t) {
            char[] ss = s.toCharArray();
            char[] ts = t.toCharArray();
            int sum=0;
            for(int i=0;i<ss.length;i++) {
                sum += ts[i] - ss[i];
            }
            sum+= ts[ts.length-1];
            return (char)sum;
        }
    }

    public char findTheDifferenceSol(String s, String t) {
        int charCode = t.charAt(s.length());
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) {
            charCode -= (int)s.charAt(i);
            charCode += (int)t.charAt(i);
        }
        return (char)charCode;
    }

    public static void main(String[] args) {
        FindTheDifference findTheDifference = new FindTheDifference();
        System.out.println(findTheDifference.findTheDifference("a", "aa"));
    }
}
