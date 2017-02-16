package test;

import org.junit.Test;
import shape.Line;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by nataliadjohari on 17/02/2017.
 */
public class LineTest {
    @Test
    public void horizontalTest1() {
        String line = Line.horizontalLine(0, '*');
        assertThat(line, is("\n"));
    }

    @Test
    public void horizontalTest2() {
        String line = Line.horizontalLine(1, '*');
        assertThat(line, is("*\n"));
    }

    @Test
    public void horizontalTest3() {
        String line = Line.horizontalLine(5, '&');
        assertThat(line, is("&&&&&\n"));
    }

    @Test
    public void verticalTest1() {
        String line = Line.verticalLine(0, '^');
        assertThat(line, is(""));
    }

    @Test
    public void verticalTest2() {
        String line = Line.verticalLine(1, '*');
        assertThat(line, is("*\n"));
    }

    @Test
    public void verticalTest3() {
        String line = Line.verticalLine(6, '#');
        assertThat(line, is("#\n#\n#\n#\n#\n#\n"));
    }
}
