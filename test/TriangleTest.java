import org.junit.Test;
import shape.Triangle;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by nataliadjohari on 17/02/2017.
 */
public class TriangleTest {
    @Test
    public void createRightTriangle0ReturnEmptyStringTest() {
        String triangle = Triangle.createRightTriangle(0,'$');
        assertThat(triangle, is(""));

    }

    @Test
    public void createRightTriangle1HashReturnHashNewLineStringTest() {
        String triangle = Triangle.createRightTriangle(1,'#');
        assertThat(triangle, is("#\n"));

    }

    @Test
    public void createRightTriangle5AsteriskReturnExpectedTriangleInAsterisksStringTest() {
        String expected = "" +
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n";
        String triangle = Triangle.createRightTriangle(5,'*');
        assertThat(triangle, is(expected));

    }

    @Test
    public void createIsoscelesTriangle0ReturnEmptyStringTest() {
        String triangle = Triangle.createIsoscelesTriangle(0,'$');
        assertThat(triangle, is(""));

    }

    @Test
    public void createIsoscelesTriangle1HashReturnHashNewLineStringTest() {
        String triangle = Triangle.createIsoscelesTriangle(1,'#');
        assertThat(triangle, is("#\n"));

    }

    @Test
    public void createIsoscelesTriangle5AsterisksCreatesExpectedTriangleInAsterisksTest() {
        String expected = "" +
                "    *\n" +
                "   ***\n" +
                "  *****\n" +
                " *******\n" +
                "*********\n";
        String triangle = Triangle.createIsoscelesTriangle(5,'*');
        assertThat(triangle, is(expected));

    }
}
