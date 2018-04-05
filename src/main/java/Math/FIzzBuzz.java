package Math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by devpriyadave on 3/23/18.
 * Write a program that outputs the string representation of numbers from 1 to n.

 But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 For numbers which are multiples of both three and five output “FizzBuzz”.
 */
public class FIzzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> returnValue = new ArrayList<String>();
        for(int i = 1; i<=n; i++ ) {
            int div3 = i%3;
            int div5 = i%5;
            if(div3 == 0 && div5 == 0) {
                returnValue.add("FizzBuzz");

            } else if(div3 == 0) {
                returnValue.add("Fizz");

            } else if(div5 == 0) {
                returnValue.add("Buzz");
            } else {
                returnValue.add(Integer.toString(i));
            }
        }
        return returnValue;
    }

    public List<String> solution(int n) {


                // return IntStream.rangeClosed(1,n)
                //     .mapToObj(x->convert(x))
                //     .collect(Collectors.toList());

                // List<String> result = new ArrayList<>(n);
                // for(int i = 1; i <= n; i++) {
                //     result.add(convert(i));
                // }
                // return result;
                final int size = n;
                return new java.util.AbstractList<String>() {
                    private static final String FIZZ_BUZZ = "FizzBuzz";
                    private static final String BUZZ = "Buzz";
                    private static final String FIZZ = "Fizz";

                    @Override
                    public int size() {
                        return size;
                    }

                    @Override
                    public String get(int index) {
                        return convert(index+1);
                    }

                    public String convert(int x) {
                        if (0 == x % 15) {return FIZZ_BUZZ;}
                        else if (0 == x % 5) {return BUZZ;}
                        else if (0 == x % 3) {return FIZZ;}
                        else {return Integer.toString(x);}
                    }
                };
            }





    public static void main(String[] args) {

    }
}
