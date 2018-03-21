package stringManipulation;

/**
 * Created by devpriyadave on 2/18/18.
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 121 true
 * 123 false
 *
 */
public class PalindromeWithoutSpace {

    public boolean myIsPalindrome(int x) {
        int reverse = 0;
        int temp = x;
        if(x < 0) {
           return false;
        }
        for(; temp!=0; temp=temp/10 ) {
            reverse = reverse * 10 + temp%10;
        }
        return reverse == x;
    }


    //Best solution
    public boolean isPalindrome(int x) {

        int rev=0,rem;
        int temp=x;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;

        }
        if(rev==temp)
            return true;
        else
            return false;


    }

    public boolean isPalindromeGivenSolution(int x) {

        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;


    }


    public static void main(String args[]) {
        PalindromeWithoutSpace pl = new PalindromeWithoutSpace();
        System.out.println(pl.myIsPalindrome(123));
    }
}
