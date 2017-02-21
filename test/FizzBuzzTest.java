import fizzbuzz.FizzBuzz;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by nataliadjohari on 17/02/2017.
 */
public class FizzBuzzTest {
    @Test
    public void fizzBuzzTest1() {
        String [] expected = new String[15];
        expected[0] = "1";
        expected[1] = "2";
        expected[2] = "Fizz";
        expected[3] = "4";
        expected[4] = "Buzz";
        expected[5] = "Fizz";
        expected[6] = "7";
        expected[7] = "8";
        expected[8] = "Fizz";
        expected[9] = "Buzz";
        expected[10] = "11";
        expected[11] = "Fizz";
        expected[12] = "13";
        expected[13] = "14";
        expected[14] = "FizzBuzz";

        List<String> output = FizzBuzz.run(1, 15);

        for (int i = 0; i < output.size(); i++) {
            assertThat(output.get(i), is(expected[i]));
        }
    }
}
