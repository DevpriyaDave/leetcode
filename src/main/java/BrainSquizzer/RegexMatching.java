package BrainSquizzer;

/**
 * Created by devpriyadave on 5/3/18.
 */
public class RegexMatching {
    public boolean isMatch(String s, String p) {
        int j = 0;
        char previousChar = ' ';
        boolean match = false;
        for(char c : p.toCharArray()) {
            if(c == '.') {
                previousChar = s.charAt(j);
                j++;
                match = true;
            } else if(c == '*') {
                while(s.charAt(j) == previousChar) {
                    j++;
                }
                match = true;

            } else {
                if(s.charAt(j) == c) {
                    match = true;
                } else {
                    match = false;
                }
            }
        }
        return match;
    }
}
