package shape;

/**
 * Created by nataliadjohari on 14/02/2017.
 */
public class Diamond {
    /**
     * Given a number n, create a centered diamond.
     *
     * @param n
     * @return
     */
    public static String createFullDiamond(int n, char c) {
        return createDiamondRows(1, n*2, n, c);
    }

    /**
     * Given a number n, create a centered diamond with name as the center row
     *
     * @param n
     * @param name
     * @param c
     * @return
     */
    public static String createNameDiamond(int n, String name, char c) {
        String line = createDiamondRows(1, n-1, n, c);
        line += name + "\n";
        line += createDiamondRows(n+1, n*2, n, c);
        return line;
    }

    /**
     * Given a size, create the rows of a centered diamond with character c
     * from row start to the end row or end of diamond
     *
     * @pre start <= end
     * @param start
     * @param end
     * @param size
     * @param c
     * @return
     */
    public static String createDiamondRows(int start, int end, int size, char c) {
        String line = "";

        end = Math.min(end, size * 2);
        for (;start <= end;start++) {
            int row = start;
            if (start > size-1) {
                row = size * 2 - start;
            }

            line += createRow(row, size, c);
        }


        return line;
    }

    /**
     * Creates the line of a diamond given the row number and size of diamond
     * @param row
     * @param size
     * @param c
     * @return
     */
    private static String createRow(int row, int size, char c) {
        String line = "";
        if (row > 0 && row <= size) {
            for (int j = 0; j < (Math.abs(size - row)); j++) {
                line += " ";
            }
            int length = 2 * row - 1;
            line += Line.horizontalLine(length, c);
        }
        return line;
    }
}
