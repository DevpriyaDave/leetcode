package stringManipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by devpriyadave on 4/30/18.
 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
        if(s==null || s.length() == 0) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < s.length(); i ++) {
            char check = s.charAt(i);
            if( !characterMap.containsKey(check)) {
                characterMap.put(check, 1);
            } else {
                characterMap.put(check, characterMap.get(check) + 1);
                count ++;
            }
            if(count >= s.length()/2){
                return -1;
            }
        }

        for(int i = 0; i < s.length(); i ++) {
            if(characterMap.get(s.charAt(i)) == 1 ) {
                return i;
            }
        }

        return -1;

    }
}
