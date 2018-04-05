package stringManipulation;

import java.security.Key;
import java.util.*;

/**
 * Created by devpriyadave on 3/20/18.
 *
 * Given a List of words, return the words that
 * can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 *
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 Output: ["Alaska", "Dad"]
 //make hashset of each row
 Make seet of each word and see set contains
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        Map<Character, Integer> row = new HashMap<Character, Integer>();
        row.put('Q', 1);
        row.put('W', 1);
        row.put('E', 1);
        row.put('R', 1);
        row.put('T', 1);
        row.put('Y', 1);
        row.put('U', 1);
        row.put('I', 1);
        row.put('O', 1);
        row.put('P', 1);
        row.put('A', 2);
        row.put('S', 2);
        row.put('D', 2);
        row.put('F', 2);
        row.put('G', 2);
        row.put('H', 2);
        row.put('J', 2);
        row.put('K', 2);
        row.put('L', 2);
        row.put('Z', 3);
        row.put('X', 3);
        row.put('C', 3);
        row.put('V', 3);
        row.put('B', 3);
        row.put('N', 3);
        row.put('M', 3);

        List<String> finalList = new ArrayList<String>();


        here: for(int i = 0; i < words.length; i++) {
            int rowOfChar = 0;
            for(Character c : words[i].toUpperCase().toCharArray()) {

                int tempRow = row.get(c);
                if(rowOfChar == 0){
                    rowOfChar = tempRow;
                } else if(rowOfChar != tempRow) {
                    continue here;
                }
            }

            finalList.add(words[i]);

        }
        return  finalList.toArray(new String[finalList.size()]);
    }

    public static void main(String[] args) {
        KeyboardRow keyBoardRow = new KeyboardRow();
        String[] finalString = keyBoardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        System.out.println(finalString);
    }
}
