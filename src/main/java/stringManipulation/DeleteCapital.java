package stringManipulation;

/**
 * Created by devpriyadave on 4/3/18.
 *
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

 We define the usage of capitals in a word to be right when one of the following cases holds:

 All letters in this word are capitals, like "USA".
 All letters in this word are not capitals, like "leetcode".
 Only the first letter in this word is capital if it has more than one letter, like "Google".
 Otherwise, we define that this word doesn't use capitals in a right way.
 */
public class DeleteCapital {
    public boolean detectCapitalUse(String word) {
        // O(n) solution is to go through each character and check if between 65 to 90 and 7 to 122

        boolean isAllLower = false;
        boolean isAllUpper = false;
        boolean isFirstUpper = false;

        // if isAllLower and int is between 65 to 90 return false
        // if isAllUpper and int is between 97 to 122 return false
        // isFirstUpper and !isAllUpper and int is between 65 to 90 return false

        char[] charWord = word.toCharArray();
        int charAt0 = (int)charWord[0];
        if(charWord.length > 1) {
            int charAt1 = (int)charWord[1];
            if(65<=charAt0 && charAt0<=90 && 65<=charAt1 && charAt1<=90) {
                isAllUpper = true;
            } else if(65<=charAt0 && charAt0<=90) {
                isFirstUpper = true;
            }else {
                isAllLower = true;
            }
        }

        for(int i=1; i < charWord.length; i++){
            int charAt = (int)charWord[i];
            if(isAllLower && 65<=charAt && charAt<=90) {
                return false;
            } else if(isAllUpper && 97<=charAt && charAt<=122) {
                return false;
            }  else if(isFirstUpper &&  65<=charAt && charAt<=90) {
                return false;
            }


        }

        return true;

    }
    public boolean detectCapitalUseSol(String word) {
        return word.equals(word.toUpperCase()) ||
                word.equals(word.toLowerCase()) ||
                Character.isUpperCase(word.charAt(0)) &&
                        word.substring(1).equals(word.substring(1).toLowerCase());
    }

    public static void main(String[] args) {
        DeleteCapital deleteCapital = new DeleteCapital();
        boolean ans = deleteCapital.detectCapitalUse("G");
        System.out.println(ans);
    }
}
