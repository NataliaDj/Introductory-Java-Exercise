/**
 * Created by nataliadjohari on 14/02/2017.
 */
public class Diamond extends Triangle {
    /**
     * Given a number n, print a centered diamond.
     * @param n
     */
    public static void printDiamond(int n) {
        printIsoscelesTriangle(n);
        for(int i = n-1; i > 0; i--) {
            printLineHelper(i, n);
        }
    }
}
