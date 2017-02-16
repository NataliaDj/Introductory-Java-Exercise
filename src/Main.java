import fizzbuzz.FizzBuzz;
import shape.Diamond;
import shape.Triangle;

import java.util.List;

/**
 * Created by nataliadjohari on 14/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Triangle.createRightTriangle(3, '*'));
        System.out.println(Triangle.createIsoscelesTriangle(3, '*'));
        System.out.println(Diamond.createFullDiamond(3, '#'));
        System.out.println(Diamond.createNameDiamond(3, "Bill", '^'));

        
        List<String> results = FizzBuzz.run(1,15);
        for (String s: results)
            System.out.println(s);

    }
}
