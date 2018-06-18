package stringManipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by devpriyadave on 4/22/18.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> noteMap = new HashMap<Character, Integer>();
        Map<Character, Integer> magazineMap = new HashMap<Character, Integer>();
        for (Character c : ransomNote.toCharArray()) {
            if (noteMap.containsKey(c)) {
                noteMap.put(c, noteMap.get(c) + 1);
            } else {
                noteMap.put(c, 1);
            }
        }

        for (Character c : magazine.toCharArray()) {
            if (magazineMap.containsKey(c)) {
                magazineMap.put(c, magazineMap.get(c) + 1);
            } else {
                magazineMap.put(c, 1);
            }
        }

        for (Character k : noteMap.keySet()) {
            if (!magazineMap.containsKey(k)) {
                return false;
            }
            if (magazineMap.get(k) < noteMap.get(k)) {
                return false;
            }
        }
        return true;
    }

    public class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] arr = new int[26];
            for (int i = 0; i < magazine.length(); i++) {
                arr[magazine.charAt(i) - 'a']++;
            }
            for (int i = 0; i < ransomNote.length(); i++) {
                if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
