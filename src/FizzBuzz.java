/**
 * Created by nataliadjohari on 14/02/2017.
 */
public class FizzBuzz {

    public static void run(int start, int end) {
        for(int i = start; i <= end; i++) {
            boolean mod3 = i % 3 == 0;
            boolean mod5 = i % 5 == 0;

            if(mod3 && mod5)
                System.out.println("FizzBuzz");
            else if (mod3)
                System.out.println("Fizz");
            else if (mod5)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
