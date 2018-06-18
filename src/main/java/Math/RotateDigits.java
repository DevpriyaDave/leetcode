package Math;

/**
 * Created by devpriyadave on 4/8/18.
 */
public class RotateDigits {
    public int rotatedDigits(int N) {
        int count = 0;
        for(int i=1; i<=N; i++) {
            String s = Integer.toString(i);
            if(s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9")) {
                System.out.println(s);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RotateDigits rotateDigits = new RotateDigits();
        rotateDigits.rotatedDigits(857);
    }
}
