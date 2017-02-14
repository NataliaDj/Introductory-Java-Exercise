/**
 * Created by nataliadjohari on 14/02/2017.
 */
public class Triangle {
    /**
     * Print one asterisk to the console.
     */
    protected static void asteriskPrint() {
        System.out.println("*");
    }

    /**
     * Given a number n, print n asterisks on one line.
     * @param n
     */
    public static void horizontalLine(int n) {
        for(int i = 0; i < n; i++)
            System.out.print("*");
        System.out.println();
    }

    /**
     * Given a number n, print n lines, each with one asterisks
     * @param n
     */
    public static void verticalLine(int n) {
        for(int i = 0; i < n; i++)
            asteriskPrint();
    }

    /**
     * Given a number n, print n lines, each with one more asterisk than the last
     * (i.e. one on the first line, two on the second,etc.)
     * @param n
     */
    public static void printRightTriangle(int n) {
        for(int i = 0; i < n; i++)
            horizontalLine(i+1);
    }

    public static void printIsoscelesTriangle(int n) {
        for (int i = 1; i <= n; i++)
            printLineHelper(i, n);
    }

    protected static void printLineHelper(int row, int size) {
        for(int j = 0; j < (Math.abs(size-row)); j++)
            System.out.print(" ");
        int length = 2 * row - 1;
        for (int j = 0; j < length; j++)
            System.out.print("*");
        System.out.println();
    }
}
