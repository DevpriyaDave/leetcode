package Stack;

import java.util.Stack;

/**
 * Created by devpriyadave on 3/23/18.
 *
 * You're now a baseball game point recorder.

 Given a list of strings, each string can be one of the 4 following types:

 Integer (one round's score): Directly represents the number of points you get in this round.
 "+" (one round's score): Represents that the points you get in this
 round are the sum of the last two valid round's points.
 "D" (one round's score): Represents that the points you get in this round
 are the doubled data of the last valid round's points.
 "C" (an operation, which isn't a round's score): Represents the last valid round's
 points you get were invalid and should be removed.
 Each round's operation is permanent and could have an impact on the round before and the round after.

 You need to return the sum of the points you could get in all the rounds.


 Input: ["5","2","C","C","+"]
 Output: 30
 Explanation:
 Round 1: You could get 5 points. The sum is: 5.
 Round 2: You could get 2 points. The sum is: 7.
 Operation 1: The round 2's data was invalid. The sum is: 5.
 Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
 Round 4: You could get 5 + 10 = 15 points. The sum is: 30.


 ["8373","C","9034","-17523","D","1492","7558","-5022","C","C","+","+","-16000","C","+","-18694","C",
 "C","C","-19377","D","-25250","20356","C","-1769","-8303","C","-25332","29884","C","+","C",
 "-29875","-15374","C","+","14584","13773","+","17037","-28248","+","16822","D","+","+",
 "-19357","-26593","-8548","4776","D","-8244","378","+","-19269","-25447","18922","-16782",
 "2886","C","-17788","D","-22256","C","308","-9185","-19074","1528","28424","D","8658","C","7221",
 "-13704","8995","-21650","22567","-29560","D","-9807","25632","6817",
 "28654","D","-18574","C","D","20103","7875","C","9911","23951","C","D","C","+","18219","-20922","D","-24923"]
 */
public class BaseballGame {
    public int calPoints(String[] ops) {
        int thridLastValid = 0;
        int secondLastValid = 0;
        int lastValid = 0;
        int sum  = 0;
        for(int i=0; i < ops.length; i++) {
            if(ops[i].equals("+")) {
                ops[i] = Integer.toString(secondLastValid + lastValid);
            } else if(ops[i].equals("C")) {
                if(i>0) {
                    sum = sum - lastValid;
                    lastValid = secondLastValid;
                    secondLastValid = thridLastValid;
                    thridLastValid = 0;
                }
                continue;
            } else if(ops[i].equals("D")) {
                ops[i] = Integer.toString(lastValid*2);
            }
            thridLastValid = secondLastValid;
            secondLastValid = lastValid;
            lastValid = Integer.parseInt(ops[i]);
            sum = sum+ lastValid;
        }

        return sum;

    }

    public int solution(String[] ops) {
        Stack<Integer> bucket = new Stack<Integer>();
        int sum = 0;

        for (int i = 0; i < ops.length; i++){
            if (ops[i].equals("+")){
                if (bucket.size() > 1){
                    int item1 = bucket.pop();
                    int item2 = bucket.peek();
                    bucket.push(item1);
                    bucket.push(item1+item2);
                    sum += item1 + item2;
                }
            } else if (ops[i].equals("D")){
                if (!bucket.isEmpty()){
                    sum += bucket.peek() * 2;
                    bucket.push(bucket.peek() * 2);
                }
            } else if (ops[i].equals("C")){
                if (!bucket.isEmpty()){
                    sum -= bucket.pop();
                }

            } else {
                int item = Integer.parseInt(ops[i]);
                bucket.push(item);
                sum += item;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        String[] points = {"8373","C","9034","-17523","D","1492","7558","-5022","C","C","+","+","-16000","C","+","-18694","C",
                "C","C","-19377","D","-25250","20356","C","-1769","-8303","C","-25332","29884","C","+","C",
                "-29875","-15374","C","+","14584","13773","+","17037","-28248","+","16822","D","+","+",
                "-19357","-26593","-8548","4776","D","-8244","378","+","-19269","-25447","18922","-16782",
                "2886","C","-17788","D","-22256","C","308","-9185","-19074","1528","28424","D","8658","C","7221",
                "-13704","8995","-21650","22567","-29560","D","-9807","25632","6817",
                "28654","D","-18574","C","D","20103","7875","C","9911","23951","C","D","C","+","18219","-20922","D","-24923"};
        int ans = baseballGame.calPoints(points);
        System.out.println(ans);
    }

}
