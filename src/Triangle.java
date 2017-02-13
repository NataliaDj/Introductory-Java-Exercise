/**
 * Created by nataliadjohari on 14/02/2017.
 */
public class Triangle {
    /**
     * Print one asterisk to the console.
     */
    public static void asteriskPrint() {
        System.out.print("*");
    }

    /**
     * Given a number n, print n asterisks on one line.
     * @param n
     */
    public static void horizontalLine(int n) {
        for (int i = 0; i < n; i++)
            asteriskPrint();
        System.out.println();
    }

}
