/**
 * Created by devpriyadave on 2/25/18.
 * Given a string, you need to reverse the order of characters in each word within
 * a sentence while still preserving whitespace and initial word order.
 * Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 //logic



 */
public class RevereseWordsInString3 {
    public String reverseWords(String s) {
        int spaceLocation = 0;
        int runner=0;
        int current=0;
        boolean reverse = false;
        char [] stringArray = s.toCharArray();
        while(current < stringArray.length) {
            if( (runner <= (stringArray.length-1) && stringArray[runner] == ' ') ){
                spaceLocation = runner;
                runner = spaceLocation -1;
                reverse = true;
            }else if(runner == stringArray.length-1 && !reverse){
                reverse = true;
                spaceLocation = runner;
            } else if(reverse) {
                if(current<runner){
                    char temp = stringArray[runner];
                stringArray[runner] = stringArray[current];
                stringArray[current] = temp;
                runner--;
                current++;
            } else {
                reverse = false;
                runner = spaceLocation+1;
                    current = spaceLocation+1;
            }
            }  else {
                runner++;
            }

        }

        return new String(stringArray);

    }

    public static void main(String[] args) {
        RevereseWordsInString3 revereseWordsInString3 = new RevereseWordsInString3();
        System.out.println(revereseWordsInString3.reverseWords("Let's take LeetCode contest"));
    }

}
