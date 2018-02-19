/**
 * Created by devpriyadave on 2/19/18.
 * Initially, there is a Robot at position (0, 0).
 * Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

 The move sequence is represented by a string. And each move is represent by a character.
 The valid robot moves are R (Right), L (Left), U (Up) and D (down).
 The output should be true or false representing whether the robot makes a circle.

 Input: "UD"
 Output: true

 Input: "LL"
 Output: false
 */
public class JudgeRouteCircle {
    public boolean myjudgeCircle(String moves) {
        if(moves.length() == 0)
            return false;
        char [] stack = new char[moves.length()];
        int ud = 0;
        int rl = 0;
        for(int i = 0; i < moves.length(); i++) {
            char nextMove = moves.charAt(i);
            switch (nextMove) {
                case 'U':
                    ud++;
                    break;
                case 'D':
                    ud--;
                    break;
                case 'L':
                    rl++;
                    break;
                case 'R':
                    rl--;
                    break;
                default:
                    break;
            }
        }
        return ud == 0 && rl ==0;
    }
    public boolean judgeCircle(String moves) {
        char m[] = moves.toCharArray();
        int U = gs('U', m);
        int D = gs('D', m);
        int L = gs('L', m);
        int R = gs('R', m);
        boolean Re;
        if(U==D&&L==R)
            Re = true;
        else
            Re = false;
        return Re;
    }

    public int gs(char zm, char zfsz[]){
        int n = 0;
        for(int i = 0; i < zfsz.length; i++){
            if(zfsz[i] == zm)
                n++;
        }
        return n;
    }



    public static void main(String[] args) {
        JudgeRouteCircle judgeRouteCircle = new JudgeRouteCircle();
        System.out.println(judgeRouteCircle.myjudgeCircle("RLUURDDDLU"));
    }
}

