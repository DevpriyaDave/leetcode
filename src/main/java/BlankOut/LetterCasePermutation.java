package BlankOut;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by devpriyadave on 4/2/18.
 * Given a string S, we can transform every letter individually
 * to be lowercase or uppercase to create another string.
 * Return a list of all possible strings we could create.
 */
public class LetterCasePermutation {

    public List<String> letterCasePermutation(String S) {

        return null;

    }
    class Solution {
        public List<String> letterCasePermutation(String S) {
            if (S == null) {
                return new LinkedList();
            }
            Queue<String> queue = new LinkedList();
            queue.offer(S);

            for (int i = 0; i < S.length(); i++) {
                if (Character.isDigit(S.charAt(i))) continue;
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    String cur = queue.poll();
                    char[] chs = cur.toCharArray();

                    chs[i] = Character.toUpperCase(chs[i]);
                    queue.offer(String.valueOf(chs));

                    chs[i] = Character.toLowerCase(chs[i]);
                    queue.offer(String.valueOf(chs));
                }
            }

            return new LinkedList(queue);
        }
    }

}
