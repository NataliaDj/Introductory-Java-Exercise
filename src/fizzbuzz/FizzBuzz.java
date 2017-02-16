package fizzbuzz;

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
     */
    public static void run(int start, int end) {
        for(int i = start; i <= end; i++) {
            boolean mod3 = i % 3 == 0;
            boolean mod5 = i % 5 == 0;

            if(mod3 && mod5) {
                System.out.println("fizzbuzz");
            } else if (mod3) {
                System.out.println("Fizz");
            } else if (mod5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
