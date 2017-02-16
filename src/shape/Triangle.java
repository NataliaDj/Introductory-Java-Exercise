package shape;

/**
 * Created by nataliadjohari on 14/02/2017.
 */
public class Triangle {

    /**
     * Given a number n, print n lines, each with one more character c
     * than the last (i.e. one on the first line, two on the second,etc.)
     * @param n
     */
    public static String createRightTriangle(int n, char c) {
        String line = "";
        for(int i = 1; i <= n; i++) {
            line += Line.horizontalLine(i, c);
        }
        return line;
    }

    /**
     * Given a number n, print a centered triangle.
     * @param n
     */
    public static String createIsoscelesTriangle(int n, char c) {
        return Diamond.createDiamondRows(1, n, n, c);
    }
}
