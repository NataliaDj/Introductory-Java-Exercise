package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nataliadjohari on 14/02/2017.
 */
public class FizzBuzz {
    /**
     * FizzBuzz.FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz"
     * instead of numbers adhering to certain rules.
     *
     * Instead of numbers divisible by three print "Fizz".<br/>
     * Instead of numbers divisible by five print "Buzz".<br/>
     * Instead of numbers divisible by three and five print "FizzBuzz.FizzBuzz".<br/>
     *
     * @param start
     * @param end
     * @return
     */
    public static List<String> run(int start, int end) {
        ArrayList<String> results = new ArrayList<String>();
        for(int i = start; i <= end; i++) {
            boolean mod3 = i % 3 == 0;
            boolean mod5 = i % 5 == 0;

            if(mod3 && mod5) {
                results.add("fizzbuzz");
            } else if (mod3) {
                results.add("Fizz");
            } else if (mod5) {
                results.add("Buzz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }
}
