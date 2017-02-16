import shape.Diamond;
import shape.Triangle;

/**
 * Created by nataliadjohari on 14/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Triangle.createRightTriangle(3, '*'));
        System.out.println(Triangle.createIsoscelesTriangle(3, '*'));
        System.out.println(Diamond.createFullDiamond(3, '#'));
        System.out.println(Diamond.createNameDiamond(3, "Bill", '^'));
        //FizzBuzz.run(1,15);

    }
}
