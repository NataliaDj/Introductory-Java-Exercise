package shape;

/**
 * Created by nataliadjohari on 17/02/2017.
 */
public class Line {
    /**
     * Given a number n, print character c n times on one line.
     * @param n
     * @param c
     */
    public static String horizontalLine(int n, char c) {
        String line = "";
        for(int i = 0; i < n; i++) {
            line += c;
        }
        line += "\n";
        return line;
    }

    /**
     * Given a number n, print n lines, each with one character c
     * @param n
     * @param c
     */
    public static String verticalLine(int n, char c) {
        String line = "";
        for(int i = 0; i < n; i++) {
            line += c + "\n";
        }
        return line;
    }
}
