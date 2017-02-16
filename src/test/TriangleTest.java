package test;

import org.junit.Test;
import shape.Triangle;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by nataliadjohari on 17/02/2017.
 */
public class TriangleTest {
    @Test
    public void rightTriangleTest1() {
        String triangle = Triangle.createRightTriangle(0,'$');
        assertThat(triangle, is(""));

    }

    @Test
    public void rightTriangleTest2() {
        String triangle = Triangle.createRightTriangle(1,'#');
        assertThat(triangle, is("#\n"));

    }

    @Test
    public void rightTriangleTest3() {
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
    public void isoscelesTriangleTest1() {
        String triangle = Triangle.createIsoscelesTriangle(0,'$');
        assertThat(triangle, is(""));

    }

    @Test
    public void isoscelesTriangleTest2() {
        String triangle = Triangle.createIsoscelesTriangle(1,'#');
        assertThat(triangle, is("#\n"));

    }

    @Test
    public void isoscelesTriangleTest3() {
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
