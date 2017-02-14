/**
 * Created by nataliadjohari on 14/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Easiest exercise ever");
        Triangle.asteriskPrint();
        System.out.println();

        System.out.println("Draw a horizontal line");
        Triangle.horizontalLine(8);
        System.out.println();

        System.out.println("Draw a vertical line");
        Triangle.verticalLine(3);
        System.out.println();

        System.out.println("Draw a right triangle");
        Triangle.printRightTriangle(3);
        System.out.println();

        System.out.println("Draw an isosceles triangle");
        Triangle.printIsoscelesTriangle(3);
        System.out.println();

        System.out.println("Draw a diamond");
        Diamond.printDiamond(3);
        System.out.println();

        System.out.println("Draw a diamond with name");
        Diamond.printNameDiamond(3, "Bill");
        System.out.println();

        FizzBuzz.run(1,15);
        
    }
}
