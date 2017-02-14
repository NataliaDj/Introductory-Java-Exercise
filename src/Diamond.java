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
        printDiamondLowerHalf(n);
    }

    /**
     * Given a number n, print a centered diamond.
     * @param n
     */
    public static void printNameDiamond(int n, String name) {
        printDiamondUpperHalf(n-1, n);
        System.out.println(name);
        printDiamondLowerHalf(n);
    }

    /**
     * Prints the lower half of a diamond given its size
     * @param size
     */
    private static void printDiamondLowerHalf(int size) {
        for(int i = size-1; i > 0; i--)
            printLineHelper(i, size);
    }
}
