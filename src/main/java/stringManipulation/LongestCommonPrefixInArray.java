package stringManipulation;

/**
 * Created by devpriyadave on 2/18/18.
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * Logic
 *
 * Take strs[0] as the prefix
 * check if next element contains prefix - if not
 * iterate over the element and get the common element if any, if nothing return ""
 * else update the prefix
 */
public class LongestCommonPrefixInArray {

    public String mylongestCommonPrefix(String[] strs) {
        if(strs.length < 1) {
            return "";
        }
        String prefix = strs[0];
        for(int i=1; i< strs.length;) {
            if(strs[i].length() >= prefix.length() && strs[i].substring(0, prefix.length()).equals(prefix) ) {
                i++;
            } else {
                String temp ="";
                for(int j = 0; j < strs[i].length();) {
                    if((strs[i].charAt(j) == prefix.charAt(j))) {
                        temp = temp + strs[i].charAt(j);
                        j++;
                    } else {
                        break;
                    }
                }
                if(temp == "") {
                    return "";
                }
                prefix = temp;
                i++;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix == "") return "";
            }
        return prefix;
    }

    public static void main(String args[]){
        LongestCommonPrefixInArray longestCommonPrefixInArray = new LongestCommonPrefixInArray();
        String [] test = {"aa","ab"};
        System.out.println(longestCommonPrefixInArray.mylongestCommonPrefix(test));

    }
}
