package OneDimensionArray;

import java.util.*;

/**
 * Created by devpriyadave on 3/30/18.
 *
 * Given an integer array with even length,
 * where different numbers in this array represent different kinds of candies.
 * Each number means one candy of the corresponding kind. You need to distribute these candies equally
 * in number to brother and sister.
 * Return the maximum number of kinds of candies the sister could gain.
 *
 * Input: candies = [1,1,2,2,3,3]
 Output: 3
 Explanation:
 There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
 Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
 The sister has three different kinds of candies.

 Input: candies = [1,1,2,3]
 Output: 2
 Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1].
 The sister has two different kinds of candies, the brother has only one kind of candies.

 Code pointer:
 Array to set

 logic

 2 numbers
 1) half of the array = candies
 2) set of array = unique
 3) if unique<=candies
    return unique
   else
 returnn candies

 Use bucket sort
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        int sisCandie = candies.length / 2;

        Set uniqueCandies = new HashSet();
        for (int v : candies) {
            uniqueCandies.add(v);
        }
        int unique = uniqueCandies.size();
        if(unique<=sisCandie) {
            return unique;
        } else {
            return sisCandie;
        }

    }

    public int solution(int[] candies) {
        boolean[] b = new boolean[200001];
        int nonEmptyBucketNo = 0;
        for (int i : candies) if (b[i + 100000] == false) {nonEmptyBucketNo++; b[i+100000] = true;}
        return nonEmptyBucketNo <= candies.length / 2 ? nonEmptyBucketNo : candies.length / 2;
    }

    public static void main(String[] args) {
        DistributeCandies distributeCandies = new DistributeCandies();
        int ans = distributeCandies.distributeCandies(new int[]{1,2,3,4});
        System.out.println(ans);
    }
}
