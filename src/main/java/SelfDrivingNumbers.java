import java.util.ArrayList;
import java.util.List;

/**
 * Created by devpriyadave on 2/23/18.
 *
 * A self-dividing number is a number that is divisible by every digit it contains.

 For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

 Also, a self-dividing number is not allowed to contain the digit zero.

 Given a lower and upper number bound, output a list of every possible self dividing number,
 including the bounds if possible.
 Input:
 left = 1, right = 22
 Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 10/10 1
 100
 105
 908 -> 908/10 = 90 % 10 = 0
 918 / 10 = 91 %10 != 0
3056 / 100
 Logic - brutforce
 for each number from left to right
 divide by each digit in the number -> while loop

 single digit will always be divided by themselves -> if left is less than 10 then add that number to 9 in the list





 */
public class SelfDrivingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<Integer>();
        if(right <= 0 || left < 1) {
            return numbers;
        }
        int i = left;
        while(1 <= i && i <= 9) {
            numbers.add(i);
            System.out.print(i + " ");
            i++;
        }
        here: for(; i <=right; i++) {
            //check for 10
            if(i%10 == 0 || (i/10)%10 == 0 || (i >= 1000 && (i/100)%10 == 0)){
                continue here;
            }
                int temp = i;
                while(temp != 0) {
                    if(i % (temp % 10) != 0)
                        continue here;
                    temp = temp/10;

            }
            numbers.add(i);
            System.out.print(i+ " ");
        }
        return  numbers;
    }

    public static void main(String args[]) {
        SelfDrivingNumbers selfDrivingNumbers = new SelfDrivingNumbers();
        selfDrivingNumbers.selfDividingNumbers(1000, 2209);

    }
}
